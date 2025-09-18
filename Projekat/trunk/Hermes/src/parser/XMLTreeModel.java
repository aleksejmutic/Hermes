package parser;

import java.util.*;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.ApplicationModel;
import view.ViewComponent;

/**
 * Wrapper klasa za definisanje modela stabla aplikacije.
 * 
 * @see ViewComponent
 * @author Aleksej Mutić
 * @version 1.0
 */
public class XMLTreeModel extends DefaultTreeModel {

	private static final long serialVersionUID = 7868214067743927908L;

	Document document = null;
	XPathExpression xPathExpression = null;
	XPath xPath = null;
	TreeElement rootPackage;

	private static final Map<String, List<String>> roleTableAccess = new HashMap<>();

	static {

		roleTableAccess.put("AS", Arrays.asList("Drzava", "Region", "Vozilo", "Adresnica", "Posiljka",
				"Korisnicki nalog", "Tip posiljke", "Tip transporta", "Evidencija posiljki", "Evidencija reklamacija"));

		roleTableAccess.put("MG",
				Arrays.asList("Posiljka", "Aktivne posiljke", "Zaduzenje vozila", "Flota vozila", "Nacin preuzimanja"));

		roleTableAccess.put("MP",
				Arrays.asList("Drzava", "Region", "Organizaciona jedinica", "Radna mjesta u Organizacionoj jedinici",
						"Raspored na radna mjesta", "Sistematizacija", "Katalog radnih mjesta"));

		roleTableAccess.put("VO",
				Arrays.asList("Vozilo", "Flota vozila", "Zaduzenje vozila", "Posiljka", "Aktivne posiljke"));

		roleTableAccess.put("RL", Arrays.asList("Posiljka", "Aktivne posiljke", "Evidencija posiljki",
				"Nacin placanja posiljke", "Nacin preuzimanja", "Status posiljke", "Ugovor o transportu"));

		roleTableAccess.put("RK", Arrays.asList("Posiljka", "Status posiljke", "Adresnica", "Tip posiljke",
				"Tip transporta", "Korisnicki nalog"));

		roleTableAccess.put("NK", Arrays.asList(""));

		roleTableAccess.put("PK", Arrays.asList("Posiljka", "Status posiljke", "Adresnica", "Tip posiljke",
				"Tip transporta", "Korisnicki nalog"));

		roleTableAccess.put("ZK",
				Arrays.asList("Drzava", "Region", "Vozilo", "Adresnica", "Posiljka", "Korisnicki nalog",
						"Organizaciona jedinica", "Radna mjesta u Organizacionoj jedinici", "Sistematizacija"));

	}

	private boolean filterByRole = true;

	public XMLTreeModel(TreeNode root, String XMLFileLocation, ApplicationModel applicationModel) {
		super(root);
		try {

			String currentRole = applicationModel.getContext().getUser().getRole();
			if (currentRole.equals("AS")) {
				setFilterByRole(false);
			} else {
				setFilterByRole(true);
			}
			List<String> allowedTables = roleTableAccess.getOrDefault(currentRole, Collections.emptyList());

			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
			document = builder.parse(XMLFileLocation);

			XPathFactory xPathFactory = XPathFactory.newInstance();
			xPath = xPathFactory.newXPath();

			rootPackage = new TreeElement.Package();
			rootPackage.code = null;
			rootPackage.name = "Database Tables";
			rootPackage.iconPath = null;

			xPathExpression = xPath.compile("//table");
			NodeList tables = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);

			for (int j = 0; j < tables.getLength(); j++) {
				Node tableNode = tables.item(j);

				String tableName = tableNode.getAttributes().getNamedItem("name").getNodeValue();

				if (filterByRole && !allowedTables.contains(tableName)) {
					continue;
				}

				TreeElement.Table tempTable = new TreeElement.Table();

				rootPackage.addElement(tempTable);
				tempTable.code = tableNode.getAttributes().getNamedItem("code").getNodeValue();
				tempTable.name = tableNode.getAttributes().getNamedItem("name").getNodeValue();

				xPathExpression = xPath.compile("column");
				NodeList columns = (NodeList) xPathExpression.evaluate(tableNode, XPathConstants.NODESET);

				for (int k = 0; k < columns.getLength(); k++) {
					TreeElement.Column tempColumn = new TreeElement.Column();

					tempColumn.code = columns.item(k).getAttributes().getNamedItem("code").getNodeValue();
					tempColumn.name = columns.item(k).getAttributes().getNamedItem("name").getNodeValue();
					tempColumn.setNullable(
							columns.item(k).getAttributes().getNamedItem("nullable").getNodeValue().contains("true"));
					tempColumn.setPrimary(
							columns.item(k).getAttributes().getNamedItem("primary").getNodeValue().contains("true"));
					tempColumn.setType(columns.item(k).getAttributes().getNamedItem("type").getNodeValue());

					if (!columns.item(k).getAttributes().getNamedItem("size").getNodeValue().isEmpty()) {
						tempColumn.setSize(
								Integer.parseInt(columns.item(k).getAttributes().getNamedItem("size").getNodeValue()));
					}

					if (columns.item(k).getAttributes().getNamedItem("autoIncrement") != null) {
						tempColumn.setAutoIncrement(columns.item(k).getAttributes().getNamedItem("autoIncrement")
								.getNodeValue().contains("true"));
					} else {
						tempColumn.setAutoIncrement(false);
					}

					tempTable.addElement(tempColumn);

					xPathExpression = xPath.compile("references");
					Node reference = (Node) xPathExpression.evaluate(columns.item(k), XPathConstants.NODE);
					if (reference != null) {
						tempColumn.setRefColumn(reference.getAttributes().getNamedItem("refColumn").getNodeValue());
						tempColumn.setRefTable(reference.getAttributes().getNamedItem("refTable").getNodeValue());
					}
				}

				xPathExpression = xPath.compile("references");
				NodeList reference = (NodeList) xPathExpression.evaluate(tableNode, XPathConstants.NODESET);

				for (int k = 0; k < reference.getLength(); k++) {
					TreeElement.Table refColumn = new TreeElement.Table();
					refColumn.code = reference.item(k).getAttributes().getNamedItem("refTable").getNodeValue();
					tempTable.addReference(refColumn);

					xPathExpression = xPath.compile("refColumn");
					NodeList refKolone = (NodeList) xPathExpression.evaluate(reference.item(k), XPathConstants.NODESET);
					for (int l = 0; l < refKolone.getLength(); l++) {
						TreeElement.Column refK = new TreeElement.Column();
						refK.code = refKolone.item(l).getTextContent();
						refColumn.addElement(refK);
					}
				}

				xPathExpression = xPath.compile("crud/create");
				Node create = (Node) xPathExpression.evaluate(tableNode, XPathConstants.NODE);
				tempTable.setCreateSProc(create.getTextContent());

				xPathExpression = xPath.compile("crud/retrieve");
				Node retrieve = (Node) xPathExpression.evaluate(tableNode, XPathConstants.NODE);
				tempTable.setRetrieveSProc(retrieve.getTextContent());

				xPathExpression = xPath.compile("crud/update");
				Node update = (Node) xPathExpression.evaluate(tableNode, XPathConstants.NODE);
				tempTable.setUpdateSProc(update.getTextContent());

				xPathExpression = xPath.compile("crud/delete");
				Node delete = (Node) xPathExpression.evaluate(tableNode, XPathConstants.NODE);
				tempTable.setDeleteSProc(delete.getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setFilterByRole(boolean filterByRole) {
		this.filterByRole = filterByRole;
	}

	@Override
	public Object getChild(Object parent, int index) {
		if (parent instanceof TreeElement.Package) {
			return ((TreeElement.Package) parent).getElementAt(index);
		} else if (parent instanceof TreeElement.Table) {
			return null;
		}
		return null;
	}

	@Override
	public int getChildCount(Object parent) {
		if (parent instanceof TreeElement.Package) {
			return ((TreeElement.Package) parent).getAllElements().size();
		} else if (parent instanceof TreeElement.Table) {
			return 0;
		}
		return 0;
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		if (parent instanceof TreeElement.Package) {
			return ((TreeElement.Package) parent).getIndexOfElement((TreeElement) child);
		} else if (parent instanceof TreeElement.Table) {
			return -1;
		}
		return -1;
	}

	@Override
	public Object getRoot() {
		return this.rootPackage;
	}

	@Override
	public boolean isLeaf(Object node) {
		return node instanceof TreeElement.Table;
	}

	public void setRootName(String name) {
		this.rootPackage.name = name;
	}
}

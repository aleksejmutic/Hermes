package parser;

import java.util.Vector;

public abstract class TreeElement {

	protected String code = null;
	protected String name = null;
	protected String iconPath = null;
	
	private Vector<TreeElement> treeElements = new Vector<TreeElement>();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public int getIndexOfElement(TreeElement element) {
		return treeElements.indexOf(element);
	}
	
	public void addElement(TreeElement element) {
		treeElements.add(element);
	}
	
	public Vector<TreeElement> getAllElements() {
		return treeElements;
	}
	
	public TreeElement getElementAt(int index) {
		return treeElements.get(index);
	}
	public String getName() {
		return name;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
	    this.iconPath = iconPath;
	}
	
	/**
	 * Klasa predstavlja element stabla koji je paket
	 * @author Grupa6
	 *
	 */
	public static class Package extends TreeElement{
		
		public Package() {
			// TODO Auto-generated constructor stub
		}
		
		public Package(String name) {
			// TODO Auto-generated constructor stub
			this.name = name;
		}
	}
	/**
	 * Klasa predstavlja element stabla koji je tabela
	 * @author Grupa6
	 *
	 */
	public static class Table extends TreeElement{
		
		private Vector<Table> refrences = new Vector<TreeElement.Table>();
		
		private String createSProc = null;
		private String retrieveSProc = null;
		private String updateSProc = null;
		private String deleteSProc = null;
		public String getCreateSProc() {
			return createSProc;
		}
		public void setCreateSProc(String createSProc) {
			this.createSProc = createSProc;
		}
		public String getRetrieveSProc() {
			return retrieveSProc;
		}
		public void setRetrieveSProc(String retrieveSProc) {
			this.retrieveSProc = retrieveSProc;
		}
		public String getUpdateSProc() {
			return updateSProc;
		}
		public void setUpdateSProc(String updateSProc) {
			this.updateSProc = updateSProc;
		}
		public String getDeleteSProc() {
			return deleteSProc;
		}
		public void setDeleteSProc(String deleteSProc) {
			this.deleteSProc = deleteSProc;
		}
				
		public void addReference(Table reference) {
			refrences.add(reference);
		}
		
		public Vector<Table> getAllRefernces(){
			return refrences;
		}	
			
			
		}
	/**
	 * Klasa predstavlja element stabla koji je kolona
	 * @author Grupa6
	 *
	 */
	public static class Column extends TreeElement{
		private Boolean primary = null;
		private Boolean nullable = null;
		private Boolean autoIncrement = null;
		private int size;
		private String type;
		private int scale;
		private String refColumn;
		private String refTable;
		public Column() {}
		public Column(String name) {
			this.name = name;
		}
		public Boolean isPrimary() {
			return primary;
		}
		public void setPrimary(Boolean primary) {
			this.primary = primary;
		}
		public Boolean isNullable() {
			return nullable;
		}
		public void setNullable(Boolean nullable) {
			this.nullable = nullable;
		}
		public void setAutoIncrement(boolean ai) {
			// TODO Auto-generated method stub
			autoIncrement = ai;
		}
		public boolean getAutoIncrement() {
			return autoIncrement;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getScale() {
			return scale;
		}
		public void setScale(int scale) {
			this.scale = scale;
		}
		public String getRefColumn() {
			return refColumn;
		}
		public void setRefColumn(String refColumn) {
			this.refColumn = refColumn;
		}
		public String getRefTable() {
			return refTable;
		}
		public void setRefTable(String refTable) {
			this.refTable = refTable;
		}
	}
}



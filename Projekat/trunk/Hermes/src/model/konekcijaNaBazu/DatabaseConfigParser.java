package model.konekcijaNaBazu;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DatabaseConfigParser {
	 private static final String NAMESPACE = "http://www.example.org/xml-db";
	    public static DatabaseConfig parseConfig(String filePath) {
	        try {
	            File xmlFile = new File(filePath);
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            factory.setNamespaceAware(true);
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document doc = builder.parse(xmlFile);

	            NodeList connections = doc.getElementsByTagNameNS(NAMESPACE, "connection");

	            if (connections.getLength() > 0) {
	                Element connElement = (Element) connections.item(0);

	                String address = connElement.getAttribute("address");
	                String port = connElement.getAttribute("port");
	                String dbName = connElement.getAttribute("database");
	                String user = connElement.getAttribute("username");
	                String password = connElement.getAttribute("password");

	                return new DatabaseConfig(address, port, dbName, user, password);
	            } else {
	                throw new RuntimeException("No <connection> element found in the XML.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}

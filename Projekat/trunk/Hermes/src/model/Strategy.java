package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface Strategy {

	public List<TableColumnModel>  parseDataModel(String tableName);
	public HashMap<String, String> parseCrudOperations(String tableName);
}

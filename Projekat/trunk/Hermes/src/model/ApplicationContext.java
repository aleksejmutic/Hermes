package model;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Helpers.LRUList;

public class ApplicationContext {
	private GeneralTableModel dataModel;
	private GeneralTableModel user;
	
	public ApplicationContext() {
		setDataModel("");
		setUser("Korisnički nalog");
		
	}

	public DataModel getDataModel() {
		return (DataModel)dataModel;
	}

	public void setDataModel(String tableName) {
		try {
			this.dataModel = new DataModel(tableName);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setUser(String tableName) {
		try {
			this.user = new UserModel("Korisnički nalog");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public UserModel getUser() {
		return (UserModel)user;
	}
	
}

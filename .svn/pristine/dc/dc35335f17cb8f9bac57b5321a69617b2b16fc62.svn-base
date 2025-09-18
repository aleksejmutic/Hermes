/***********************************************************************
 * Module:  UserModel.java
 * Author:  GoranMilanovic
 * Purpose: Defines the Class UserModel
 ***********************************************************************/
package model;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Helpers.DataTypeMapper;
import Helpers.HashUtils;
import model.konekcijaNaBazu.DatabaseType;
import model.konekcijaNaBazu.DbManipulation;

public class UserModel extends GeneralTableModel {
	private static final long serialVersionUID = 1L;
	private String userId = "";
	private String role = "";

	public UserModel(String tableName) throws ParserConfigurationException, SAXException, IOException {
		super(tableName);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void logIn(String username, String password) {
		this.data.clear();

		try {

			callableSatement = this.dBResultSet.getDbManipulation().getConnection()
					.prepareCall("{ call " + crudOps.get("retrieveUserId") + " }");
			callableSatement.setString(1, username);
			callableSatement.setString(2, password);
			resultSet = callableSatement.executeQuery();

			if (resultSet.next()) {
				this.setUserId((String) resultSet.getObject("User ID"));
			}

			callableSatement.clearBatch();

			callableSatement = this.dBResultSet.getDbManipulation().getConnection()
					.prepareCall("{ call " + crudOps.get("retrieveUserRole") + " }");
			callableSatement.setString(1, this.userId);
			resultSet = callableSatement.executeQuery();

			if (resultSet.next()) {
				this.setRole((String) resultSet.getObject("Oznaka Role"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (!this.userId.isEmpty() && !this.role.isEmpty()) {
			this.data.add(getUserById((Object) this.userId));
		} else {
			JOptionPane.showMessageDialog(null, "Pogrešno korisničko ime ili lozinka", "Greška pri logovanju",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void getAllData() {
		super.getAllData();
	}

	@Override
	public boolean deleteRow(HashMap<String, Object> columnPKs) {
		return super.deleteRow(columnPKs);
	}
	
	@Override
	public List<Object> getRowById(HashMap<String, Object> columnPKs) {
		return super.getRowById(columnPKs);
	}

	public List<Object> getUserById(Object rowId) {
		String Id = (String) rowId;
		this.data.clear();
		try {
			callableSatement = this.dBResultSet.getDbManipulation().getConnection().prepareCall("{ call " + crudOps.get("retrieveUserById") + " }");

			callableSatement.setString(1, Id);

			resultSet = callableSatement.executeQuery();

			List<Object> row = new Vector<Object>();

			while (resultSet.next()) {

				for (int i = 0; i < columns.size(); i++) {
					row.add(resultSet.getObject(columns.get(i).getColumName()));
				}
			}
			return row;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addRow(HashMap<String, String> params) {
		super.addRow(params);
	}

	@Override
	public void editRow(HashMap<String, String> params) {
		super.editRow(params);
	}

	@Override
	public String toString() {
		return "UserID: " + userId + " role: " + role;
	}

}
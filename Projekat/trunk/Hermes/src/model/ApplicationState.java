package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import Helpers.DataTypeMapper;

public class ApplicationState {
	protected ApplicationModel applicationModel;
	
	public ApplicationState(ApplicationModel applicationModel) {
		this.applicationModel = applicationModel;
	}
    
    public void getAllData() {
    	applicationModel.getContext().getDataModel().getAllData();
    }

    public boolean deleteRow(HashMap<String, Object> columnPKs) {
    	return applicationModel.getContext().getDataModel().deleteRow(columnPKs);
	}

    public void getRowById(HashMap<String, Object> columnPKs) {
    	applicationModel.getContext().getDataModel().getRowById(columnPKs);
    }

    public void addRow(HashMap<String, String> params) {
    	applicationModel.getContext().getDataModel().addRow(params);
    }

    public void editRow(HashMap<String, String> params) {
    	applicationModel.getContext().getDataModel().editRow(params);
    }
}

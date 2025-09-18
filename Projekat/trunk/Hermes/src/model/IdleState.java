/***********************************************************************
 * Module:  IdleState.java
 * Author:  ikano
 * Purpose: Defines the Class IdleState
 ***********************************************************************/

package model;

import java.util.HashMap;

public class IdleState extends ApplicationState {

	public IdleState(ApplicationModel applicationModel) {
		super(applicationModel);
		System.out.println("Idle");
	}
	
	@Override
	public boolean deleteRow(HashMap<String, Object> columnPKs){
		return super.deleteRow(columnPKs);
		
	} 

	@Override
	public void getAllData() {
		super.getAllData();
		System.out.println("Prelazim u aktivno stanje");
		applicationModel.setApplicationState(new ActiveState(this.applicationModel));
		applicationModel.notifySubscribers();
	}

	@Override
	public void getRowById(HashMap<String, Object> columnPKs) {
		super.getRowById(columnPKs);
		
	}

	@Override
	public void addRow(HashMap<String, String> params) {
		super.addRow(params);
		
	}

	@Override
	public void editRow(HashMap<String, String> params) {
		super.editRow(params);
		
	}

}
package model.command;

import model.ActiveState;
import model.ApplicationModel;
import model.EditState;

/**
 * ReadCommand retrieves row data from the database and updates the ResultSet.
 */
public class ReadCommand extends Command {
	
	private String tableName;

	public ReadCommand(ApplicationModel applicationModel, String tableName) {
		super(applicationModel);
		this.tableName = tableName;
	}

	@Override
	public void execute() {
		this.applicationModel.getContext().setDataModel(tableName);
		applicationModel.setApplicationState(new ActiveState(this.applicationModel));
		this.applicationModel.getApplicationState().getAllData();
		this.applicationModel.notifySubscribers();
	}
   
}
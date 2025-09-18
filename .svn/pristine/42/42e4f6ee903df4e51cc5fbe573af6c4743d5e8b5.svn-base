package model.command;

import model.ApplicationModel;

public abstract class Command {
	protected ApplicationModel applicationModel;
	public abstract void execute();
	
	public Command(ApplicationModel applicationModel) {
		this.applicationModel = applicationModel;
	}
	
	public ApplicationModel getApplicationModel() {
		return applicationModel;
	}
}

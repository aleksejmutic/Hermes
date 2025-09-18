package model.command;

import model.ApplicationModel;
import model.TableColumnModel;
import view.Table;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DeleteCommand extends Command {
	
	private int rowIndex;
	private Table table;
	
    public DeleteCommand(ApplicationModel applicationModel, Table table) {
        super(applicationModel);
        this.table = table;
    }

    @Override
    public void execute() {
        int response = JOptionPane.showConfirmDialog(
                null,
                "Da li ste sigurni da želite da obrišete ovaj podatak?",
                "Potvrda brisanja",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );

            if (response == JOptionPane.YES_OPTION) {
                System.out.println("Podatak je obrisan.");

        this.rowIndex = table.getSelectedRow();
    	List<TableColumnModel> tableColumns = this.applicationModel.getContext().getDataModel().getColumns();
    	List<Object> tableData = this.applicationModel.getContext().getDataModel().getData().get(rowIndex);
    	HashMap<String, Object> primaryKeys = new HashMap<String, Object>();
    	
    	for (int i=0; i<tableColumns.size(); i++) {
			if(tableColumns.get(i).isPrimaryKey()){
				primaryKeys.put((tableColumns.get(i).getColumType()+i), tableData.get(i));
			}
		}
    	
    	this.applicationModel.getApplicationState().deleteRow(primaryKeys);
    	this.applicationModel.getApplicationState().getAllData();
    	applicationModel.notifySubscribers();
            }
        JOptionPane.showMessageDialog(null, "Podatak je uspješno obrisan!");
    }
}
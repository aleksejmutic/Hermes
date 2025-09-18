/***********************************************************************
 * Module:  Toolbar.java
 * Author:  goran
 * Purpose: Defines the Class Toolbar
 ***********************************************************************/

package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.CommandActionListener;
import model.ActiveState;
import model.ApplicationModel;
import model.ApplicationState;
import model.EditState;
import model.IdleState;
import model.TableColumnModel;
import model.command.DeleteCommand;
import observer.Subject;
/**
 * Klasa za definisanje trake sa alatima glavnog prozora.
 * @see ViewComponent
 * @author Aleksej Mutić
 * @version 1.0
 */
public class Toolbar extends JToolBar implements ViewComponent {
	private ApplicationModel applicationModel;
	public ContextMenu toolbarContextMenu;
	private JButton nextButton = null;
	private JButton previousButton = null;
	private JButton firstButton = null;
	private JButton lastButton = null;
	private JButton newButton = null;
	private JButton editButton = null;
	private JButton deleteButton = null;
	private JButton acceptButton = null;
	private JButton cancelButton = null;
	private JButton reportButton = null;
	private Object rowId = null;
	
	public Toolbar(Table table, ApplicationModel applicationModel, ViewComponent form) {
		this.applicationModel = applicationModel;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		setFloatable(false); 

		
		nextButton = new JButton();
		Image nextIcon = toolkit.getImage("src/icons/next.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		nextButton.setIcon(new ImageIcon(nextIcon));
		nextButton.setToolTipText("Sljedeće");
		nextButton.addActionListener(e -> {
            if (table != null) table.selectNextRow();
        });
		
		previousButton = new JButton();
		Image previousIcon = toolkit.getImage("src/icons/previous.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		previousButton.setIcon(new ImageIcon(previousIcon));
		previousButton.setToolTipText("Prethodno");
		previousButton.addActionListener(e -> {
            if (table != null) table.selectPreviousRow();
        });
		
		firstButton = new JButton();
		Image firstIcon = toolkit.getImage("src/icons/first.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		firstButton.setIcon(new ImageIcon(firstIcon));
		firstButton.setToolTipText("Prvo");
		firstButton.addActionListener(e -> {
            if (table != null) table.selectFirstRow();
        });
		
		lastButton = new JButton();
		Image secondIcon = toolkit.getImage("src/icons/last.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		lastButton.setIcon(new ImageIcon(secondIcon));
		lastButton.setToolTipText("Posljednje");
		lastButton.addActionListener(e -> {
            if (table != null) table.selectLastRow();
        });

	    newButton = new JButton();
	    Image newIcon = toolkit.getImage("src/icons/new.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	    newButton.setIcon(new ImageIcon(newIcon));
	    newButton.setToolTipText("Novi zapis");
	    newButton.addActionListener(e -> {
	        if (form instanceof Form) {
	            generateForm((Form) form, table, new ActiveState(applicationModel));
	        }
	    });
		editButton = new JButton();
		Image editIcon = toolkit.getImage("src/icons/edit.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		editButton.setIcon(new ImageIcon(editIcon));
		editButton.setToolTipText("Uredi");
		editButton.addActionListener(e -> {
	        if (form instanceof Form) {
	            generateForm((Form) form, table, new EditState(applicationModel));
	        }
	    });
		deleteButton = new JButton();
		Image deleteIcon = toolkit.getImage("src/icons/delete.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		deleteButton.setIcon(new ImageIcon(deleteIcon));
		deleteButton.setToolTipText("Izbriši");
		deleteButton.addActionListener(new CommandActionListener(new DeleteCommand(applicationModel, table)));
		
		acceptButton = new JButton();
		Image acceptIcon = toolkit.getImage("src/icons/accept.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		acceptButton.setIcon(new ImageIcon(acceptIcon));
		acceptButton.setToolTipText("Prihvati");
		
		cancelButton = new JButton();
		Image cancelIcon = toolkit.getImage("src/icons/cancel.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		cancelButton.setIcon(new ImageIcon(cancelIcon));
		cancelButton.setToolTipText("Otkaži");
		
		reportButton = new JButton();
		Image reportIcon = toolkit.getImage("src/icons/report.png").getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		reportButton.setIcon(new ImageIcon(reportIcon));
		reportButton.setToolTipText("Izvještaj");
		
		this.addAllButtons();
		
	}
	
	public void idleState() {
		nextButton.setEnabled(false);
		previousButton.setEnabled(false);
		firstButton.setEnabled(false);
		lastButton.setEnabled(false);
		newButton.setEnabled(false);
		editButton.setEnabled(false);
		deleteButton.setEnabled(false);
		acceptButton.setEnabled(false);
		cancelButton.setEnabled(false);
		reportButton.setEnabled(true);
	}

	public void activeState() {
		nextButton.setEnabled(true);
		previousButton.setEnabled(true);
		firstButton.setEnabled(true);
		lastButton.setEnabled(true);
		newButton.setEnabled(true);
		editButton.setEnabled(true);
		deleteButton.setEnabled(true);
		acceptButton.setEnabled(true);
		cancelButton.setEnabled(true);
		reportButton.setEnabled(true);
	}

	public void editState() {
		nextButton.setEnabled(false);
		previousButton.setEnabled(false);
		firstButton.setEnabled(false);
		lastButton.setEnabled(false);
		newButton.setEnabled(false);
		editButton.setEnabled(false);
		deleteButton.setEnabled(false);
		acceptButton.setEnabled(false);
		cancelButton.setEnabled(false);
		reportButton.setEnabled(false);
	}
	
	private void addAllButtons() {
		
		if(applicationModel.getApplicationState() instanceof EditState){
			this.editState();
		}else if(applicationModel.getApplicationState() instanceof ActiveState){
			this.activeState();
		}else {
			this.idleState();
		}
		
	    add(firstButton);
	    add(previousButton);
	    add(nextButton);
	    add(lastButton);
	    add(newButton);
	    add(editButton);
	    add(deleteButton);
	    add(acceptButton);
	    add(cancelButton);
	    add(reportButton);
	}
	private void generateForm(Form form, Table table, ApplicationState state) {
	    form.setVisible(true);

        int rowIndex = table.getCustomTable().getSelectedRowIndex();
    	List<TableColumnModel> tableColumns = this.applicationModel.getContext().getDataModel().getColumns();
    	List<Object> tableData = this.applicationModel.getContext().getDataModel().getData().get(rowIndex);
    	HashMap<String, Object> primaryKeys = new HashMap<String, Object>();
    	
    	for (int i=0; i<tableColumns.size(); i++) {
			if(tableColumns.get(i).isPrimaryKey()){
				primaryKeys.put((tableColumns.get(i).getColumType()+i), tableData.get(i));
			}
		}
    	

	    form.renderForm(this.applicationModel, state, rowIndex,
	    		primaryKeys.keySet()!=null ? applicationModel.getContext().getDataModel().getRowById(primaryKeys) : null, table);
	}

	
	@Override
	public void update(Subject applicationModel) {
		this.applicationModel = (ApplicationModel) applicationModel;
		
		this.addAllButtons();
		
		repaint();
		revalidate();
	}

}
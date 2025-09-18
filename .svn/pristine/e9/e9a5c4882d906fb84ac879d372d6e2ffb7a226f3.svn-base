/***********************************************************************
 * Module:  Table.java
 * Author:  goran
 * Purpose: Defines the Class Table
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.ApplicationModel;
import model.DataModel;
import model.TableColumnModel;
import observer.Subject;
import parser.XMLTableGenerator;

/**
 * Wrapper klasa za tabelu koja učitava podatke iz baze.
 * 
 * @see CustomTable
 * @author Aleksej Mutić
 * @version 1.0
 */
public class Table extends JPanel implements ViewComponent {

	private CustomTable customTable;
	private ApplicationModel applicationModel;

	public Table(ApplicationModel applicationModel) {
		this.applicationModel = applicationModel;
		setLayout(new BorderLayout());
	}

	/**
	 * Metoda koja prikazuje tabelu u zavisnosti od naziva koji je unesen kao
	 * parametar.
	 *
	 * @param tableName
	 * @return void
	 */
	public void showTable(ApplicationModel applicationModel) {

		if (customTable != null) {
			remove(customTable);
			
			int selectedIndex = customTable.getSelectedRowIndex();
			customTable = new CustomTable(applicationModel.getContext().getDataModel(), applicationModel);
			customTable.setSelectedRowIndex(selectedIndex);
		}else
		{
			customTable = new CustomTable(applicationModel.getContext().getDataModel(), applicationModel);
		}
		List<List<Object>> data = applicationModel.getContext().getDataModel().getData();
		boolean hasData = data.stream().anyMatch(col -> col != null && !col.isEmpty());

		if (hasData) {
			add(customTable, BorderLayout.CENTER);
			setVisible(true);
			customTable.setVisible(true);
		} else {
			setVisible(false);
			customTable.setVisible(false);
		}

		revalidate();
		repaint();
	}

	public int getSelectedRow() {
		if (customTable != null)
			return customTable.getSelectedRowIndex();
		return (Integer) null;
	}

	public void selectNextRow() {
		if (customTable != null)
			customTable.selectNextRow();
	}

	public void selectPreviousRow() {
		if (customTable != null)
			customTable.selectPreviousRow();
	}

	public void selectFirstRow() {
		if (customTable != null)
			customTable.selectFirstRow();
	}

	public void selectLastRow() {
		if (customTable != null)
			customTable.selectLastRow();
	}

	public CustomTable getCustomTable() {
		return customTable;
	}

	public void setCustomTable(CustomTable customTable) {
		this.customTable = customTable;
	}

	@Override
	public void update(Subject applicationModel) {
		this.applicationModel = (ApplicationModel) applicationModel;

		if (customTable != null) {
			remove(customTable);
			customTable = null;
		}

		showTable(this.applicationModel);

		revalidate();
		repaint();
	}

}
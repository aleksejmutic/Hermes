/***********************************************************************
 * Module:  MenuBar.java
 * Author:  goran
 * Purpose: Defines the Class MenuBar
 ***********************************************************************/

package view;

import java.util.*;

import javax.swing.JMenuBar;

import model.ApplicationModel;
import observer.Subject;
import view.menubar.menus.AccountMenu;
import view.menubar.menus.EditMenu;
import view.menubar.menus.FileMenu;
import view.menubar.menus.HelpMenu;
import view.menubar.menus.ReportsMenu;
/**
 * Klasa za definisanje trake sa menijima glavnog prozora.
 * @see ViewComponent
 * @author Aleksej Mutić
 * @version 1.0
 */
public class MenuBar extends JMenuBar implements ViewComponent{
	private FileMenu fileMenu = null;
	private EditMenu editMenu = null;
	private ReportsMenu reportsMenu = null;
	private HelpMenu helpMenu = null;
	private AccountMenu accountMenu = null;
	
	public MenuBar(Table table, ApplicationModel applicationModel, ViewComponent form) {
		fileMenu = new FileMenu(applicationModel);
		add(fileMenu);
		
		editMenu = new EditMenu(table, applicationModel, form);
		add(editMenu);
		
		reportsMenu = new ReportsMenu();
		add(reportsMenu);
		
		helpMenu = new HelpMenu();
		add(helpMenu);
		
		accountMenu = new AccountMenu(applicationModel);
		add(accountMenu);
		
		setVisible(true);
	}

	public void idleState() {
		fileMenu.idleState();
		editMenu.idleState();
		reportsMenu.idleState();
		helpMenu.idleState();
	}

	public void activeState() {
		fileMenu.activeState();
		editMenu.activeState();
		reportsMenu.activeState();
		helpMenu.activeState();
	}

	public void editState() {
		fileMenu.editState();
		editMenu.editState();
		reportsMenu.editState();
		helpMenu.editState();
	}
	
	@Override
	public void update(Subject applicationModel) {
		// TODO Auto-generated method stub

	}

}
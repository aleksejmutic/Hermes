/***********************************************************************
 * Module:  ApplicationWindow.java
 * Author:  goran
 * Purpose: Defines the Class ApplicationWindow
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import model.ApplicationModel;

/**
 * Klasa za definisanje strukture glavnog prozora.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class ApplicationWindow {
	private ApplicationModel applicationModel;
	private WindowFrame windowFrame = null;
	private ViewComponent menuBar = null;
	private ViewComponent toolBar = null;
	private ViewComponent tree = null;
	private ViewComponent statusBar = null;
	private ViewComponent table = null;
	private ViewComponent form = null;

	public ApplicationWindow(ApplicationModel applicationModel) throws HeadlessException {
		this.applicationModel = applicationModel;

		windowFrame = new WindowFrame();
		statusBar = new StatusBar(applicationModel);

		JLayeredPane rightPanelContainer = new JLayeredPane() {
		    @Override
		    public void doLayout() {
		        super.doLayout();
		        for (Component comp : getComponents()) {
		            comp.setBounds(0, 0, getWidth(), getHeight());
		        }
		    }
		};

		table = new Table(applicationModel);
		((Table) table).showTable(applicationModel);

		form = new Form(applicationModel);
		
		tree = new Tree(applicationModel, (Form)form);

		toolBar = new Toolbar((Table) table, applicationModel, (ViewComponent) form);

		((Component) table).setBounds(0, 0, 1100, 600);
		((Component) form).setBounds(0, 0, 1100, 600);
		
		rightPanelContainer.add((Component) table, JLayeredPane.DEFAULT_LAYER);
		rightPanelContainer.add((Component) form, JLayeredPane.PALETTE_LAYER);
		
		menuBar = new MenuBar((Table) table, applicationModel, (ViewComponent) form);

		windowFrame.setJMenuBar((MenuBar) menuBar);

		windowFrame.add((Toolbar) toolBar, BorderLayout.NORTH);

		windowFrame.add((Tree) tree, BorderLayout.WEST);

		windowFrame.add((StatusBar) statusBar, BorderLayout.SOUTH);

		windowFrame.add(rightPanelContainer, BorderLayout.CENTER);

		windowFrame.setVisible(true);

		applicationModel.addSubscriber(tree);
		applicationModel.addSubscriber(statusBar);
		applicationModel.addSubscriber(toolBar);
		applicationModel.addSubscriber(form);
		applicationModel.addSubscriber(table);
	}

}
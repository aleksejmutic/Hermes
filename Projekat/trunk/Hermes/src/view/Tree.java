package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.ApplicationModel;
import model.EditState;
import model.command.Command;
import model.command.ReadCommand;
import observer.Subject;
import parser.XMLTreeModel;

/**
 * Wrapper klasa za definisanje stabla aplikacije.
 * @see ViewComponent
 * @author Aleksej Mutić
 * @version 1.0
 */
public class Tree extends JPanel implements ViewComponent{
	
	private CustomTree customTree = null;
	private ApplicationModel applicationModel;
	private Form form;
	
	public Tree(ApplicationModel applicationModel, Form form) {
		this.applicationModel = applicationModel;
		this.form = form;
		String path = "src/resources/databaseXML.xml"; 
	    XMLTreeModel model = new XMLTreeModel(null, path, applicationModel);
	    customTree = new CustomTree(model);
	    JScrollPane scrollPane = new JScrollPane(customTree);
	    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


		setPreferredSize(new Dimension(300, 0));
		setLayout(new BorderLayout());
		setBackground(new Color(173, 216, 230));
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
	    customTree.addTreeSelectionListener(e -> {
	        Object selectedNode = customTree.getLastSelectedPathComponent();
	        if (selectedNode != null) {
	        	this.form.setVisible(false);
	        	Command readCommand = new ReadCommand(applicationModel, selectedNode.toString());
	        	readCommand.execute();
	        }
	    });
	    add(scrollPane, BorderLayout.CENTER);

	}
	
	@Override
	public void update(Subject applicationModel) {
		this.applicationModel = (ApplicationModel) applicationModel;
	}

	public CustomTree getCustomTree() {
		return customTree;
	}
	
	
	
	

}

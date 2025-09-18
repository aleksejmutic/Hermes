package view.menubar.menus;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.KeyStroke;

import model.ApplicationModel;
import view.MenuItem;
import view.Table;
import view.ViewComponent;

/**
 * Klasa za definisanje menija za rad sa aplikacijom.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class FileMenu extends JMenu implements Menu {

	private MenuItem changeXML = null;
	private MenuItem closeApplication = null;

	public FileMenu(ApplicationModel applicationModel) {
		super("Aplikacija");

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		changeXML = new MenuItem("Promjeni XML");
		Image changeXMLIcon = toolkit.getImage("src/icons/xml (1).png");
		changeXMLIcon = changeXMLIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		changeXML.setIcon(new ImageIcon(changeXMLIcon));
		add(changeXML);

		addSeparator();

		closeApplication = new MenuItem("Zatvori aplikaciju");
		Image closeApplicationIcon = toolkit.getImage("src/icons/close.png");
		closeApplicationIcon = closeApplicationIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		closeApplication.setIcon(new ImageIcon(closeApplicationIcon));
		closeApplication.setMnemonic(KeyEvent.VK_ESCAPE);
		closeApplication.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, KeyEvent.ALT_DOWN_MASK));
		closeApplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(closeApplication);

		setVisible(true);
	}

	@Override
	public void idleState() {
		changeXML.setEnabled(true);
		closeApplication.setEnabled(true);
	}

	@Override
	public void activeState() {
		changeXML.setEnabled(true);
		closeApplication.setEnabled(true);
	}

	@Override
	public void editState() {
		changeXML.setEnabled(true);
		closeApplication.setEnabled(true);
	}

}

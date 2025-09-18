package view.menubar.menus;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import view.MenuItem;

/**
 * Klasa za definisanje menija za korisničku pomoć.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class HelpMenu extends JMenu implements Menu {
	private MenuItem aboutMenuItem = null;

	public HelpMenu() {
		super("Pomoć");
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		aboutMenuItem = new MenuItem("Hermes");
		Image aboutIcon = toolkit.getImage("src/icons/about.png");
		aboutIcon = aboutIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		aboutMenuItem.setIcon(new ImageIcon(aboutIcon));
		aboutMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File htmlFile = new File("src/lib/Hermes.html"); // adjust path if different
					if (htmlFile.exists()) {
						Desktop.getDesktop().browse(htmlFile.toURI());
					} else {
						JOptionPane.showMessageDialog(null, "Datoteka nije pronađena: " + htmlFile.getAbsolutePath());
					}
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Greška pri otvaranju stranice: " + ex.getMessage());
				}
			}
		});

		add(aboutMenuItem);
	}

	@Override
	public void idleState() {
		aboutMenuItem.setEnabled(true);
	}

	@Override
	public void activeState() {
		aboutMenuItem.setEnabled(true);
	}

	@Override
	public void editState() {
		aboutMenuItem.setEnabled(true);
	}

}

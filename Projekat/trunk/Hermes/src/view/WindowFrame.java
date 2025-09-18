/***********************************************************************
 * Module:  WindowFrame.java
 * Author:  goran
 * Purpose: Defines the Class WindowFrame
 ***********************************************************************/

package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.config.AppConfig;

/**
 * Klasa za definisanje izgleda glavnog prozora.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class WindowFrame extends JFrame {

	public WindowFrame() {
			AppConfig config = AppConfig.getInstance();
			setTitle(config.getName());
			setSize(config.getWidth(), config.getHeight());
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			setLocationRelativeTo(null);
			ImageIcon icon = new ImageIcon("src/icons/hermes-logo.png");
			setIconImage(icon.getImage());
			setVisible(true);

	}

}
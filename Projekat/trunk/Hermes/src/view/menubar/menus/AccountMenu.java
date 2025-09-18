package view.menubar.menus;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.SwingUtilities;

import model.ApplicationModel;
import view.ApplicationView;
import view.LoginFrame;
import view.MenuItem;

public class AccountMenu extends JMenu implements Menu{
	private MenuItem about = null;
	private MenuItem logOutUser = null;
	private MenuItem logInUser = null;
	ApplicationModel applicationModel;
	
	public AccountMenu(ApplicationModel applicationModel) {
		super("Korisnik");
		
		this.applicationModel = applicationModel;
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		about = new MenuItem("O korisniku");
		Image aboutUserIcon = toolkit.getImage("src/icons/user.png");
		aboutUserIcon = aboutUserIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH); 
		about.setIcon(new ImageIcon(aboutUserIcon));
		add(about);
		
		logInUser = new MenuItem("Prijavi se");
		Image logInUserIcon = toolkit.getImage("src/icons/log-in.png");
		logInUserIcon = logInUserIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH); 
		logInUser.setIcon(new ImageIcon(logInUserIcon));
		logInUser.addActionListener(e->{
			JFrame parentFrame = null;
			Window window = SwingUtilities.getWindowAncestor(this);
			if (window instanceof JFrame) {
			    parentFrame = (JFrame) window;
			}
			
			LoginFrame loginFrame = new LoginFrame(applicationModel, (JFrame)parentFrame);
			loginFrame.show();
		});
		add(logInUser);
		
		logOutUser = new MenuItem("Odjavi se");
		Image logOutUserIcon = toolkit.getImage("src/icons/logOut.png");
		logOutUserIcon = logOutUserIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH); 
		logOutUser.setIcon(new ImageIcon(logOutUserIcon));
		logOutUser.addActionListener(e->{
			ApplicationModel newApplicationModel = new ApplicationModel();
			ApplicationView newApplicationView = new ApplicationView(newApplicationModel);
			
			Window window = SwingUtilities.getWindowAncestor(this);
			if (window instanceof JFrame) {
			    JFrame parentFrame = (JFrame) window;
			    parentFrame.dispose();
			}
			
			LoginFrame loginFrame = new LoginFrame(applicationModel, null);
			loginFrame.show();
		});
		add(logOutUser);
	}

	@Override
	public void idleState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activeState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editState() {
		// TODO Auto-generated method stub
		
	}
	
	
}

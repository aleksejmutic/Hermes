/***********************************************************************
 * Module:  LoginFrame.java
 * Author:  goran
 * Purpose: Defines the Class LoginFrame
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.ApplicationModel;
import view.config.AppConfig;

/**
 * Klasa za definisanje prozora za prijavu korisnika.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class LoginFrame extends JFrame {
	private ApplicationModel applicationModel;
	public ApplicationWindow applicationWindow;

	public LoginFrame(ApplicationModel applicationModel, JFrame frame) {
		this.applicationModel = applicationModel;
		AppConfig config = AppConfig.getInstance();
		
		setTitle(config.getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(550, 450);
		setLocationRelativeTo(null);
		setResizable(false);

		ImageIcon iconApp = new ImageIcon("src/icons/hermes-transparent.png");
		setIconImage(iconApp.getImage());

		JPanel mainPanel = new JPanel(new BorderLayout());

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(173, 216, 230));
		leftPanel.setLayout(new BorderLayout());

		JLabel imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imageLabel.setVerticalAlignment(SwingConstants.CENTER);

		ImageIcon icon = new ImageIcon("src/icons/hermes.png");
		Image scaledImage = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		imageLabel.setIcon(new ImageIcon(scaledImage));

		leftPanel.add(imageLabel, BorderLayout.CENTER);

		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(new Color(255, 255, 255));
		rightPanel.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2, 5, 2, 5);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JLabel usernameLabel = new JLabel("Korisničko ime:");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));
		JTextField usernameField = new JTextField(20);
		usernameField.setPreferredSize(new Dimension(250, 40));

		JLabel passwordLabel = new JLabel("Lozinka:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
		JPasswordField passwordField = new JPasswordField(20);
		passwordField.setPreferredSize(new Dimension(250, 40));

		JButton loginButton = createStyledButton("Prijavi se");
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	            char[] passwordChars = passwordField.getPassword();
	            String password = new String(passwordChars);
				applicationModel.getContext().getUser().logIn(usernameField.getText(), password);
				applicationModel.notifySubscribers();
				
				if(!applicationModel.getContext().getUser().getUserId().isEmpty())
				{
					dispose();
					new ApplicationWindow(applicationModel);	
				}
				
				if(frame != null)
				{
					frame.dispose();
				}
			}
		});

		JButton guestLoginButton = createStyledButton("Prijavi se kao gost");
		guestLoginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				 new ShipmentIdWindow(applicationModel);
			}
		});

		gbc.gridy = 0;
		rightPanel.add(usernameLabel, gbc);

		gbc.gridy = 1;
		rightPanel.add(usernameField, gbc);

		gbc.gridy = 2;
		rightPanel.add(passwordLabel, gbc);

		gbc.gridy = 3;
		rightPanel.add(passwordField, gbc);

		gbc.gridy = 4;
		rightPanel.add(Box.createVerticalStrut(5), gbc);

		gbc.gridy = 5;
		rightPanel.add(loginButton, gbc);

		gbc.gridy = 6;
		rightPanel.add(Box.createVerticalStrut(5), gbc);

		gbc.gridy = 7;
		rightPanel.add(guestLoginButton, gbc);

		leftPanel.setPreferredSize(new Dimension(getWidth() / 2, getHeight()));
		rightPanel.setPreferredSize(new Dimension(getWidth() / 2, getHeight()));

		mainPanel.add(leftPanel, BorderLayout.WEST);
		mainPanel.add(rightPanel, BorderLayout.CENTER);

		add(mainPanel);
		setVisible(true);
	}

	private JButton createStyledButton(String text) {
		JButton button = new JButton(text);
		button.setPreferredSize(new Dimension(250, 40));
		button.setBackground(new Color(173, 216, 230));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Arial", Font.BOLD, 14));
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		button.setBorder(BorderFactory.createCompoundBorder(button.getBorder(),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(new Color(135, 206, 250));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(173, 216, 230));
			}
		});

		return button;
	}
}
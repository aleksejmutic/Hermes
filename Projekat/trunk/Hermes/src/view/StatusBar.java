/***********************************************************************
 * Module:  StatusBar.java
 * Author:  ikano
 * Purpose: Defines the Class StatusBar
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.ApplicationModel;
import observer.Subject;

public class StatusBar extends JPanel implements ViewComponent {

	private static final long serialVersionUID = 1L;
	ApplicationModel applicationModel;
	protected JLabel leftLabel;
    protected JLabel centerLabel;
    protected JLabel rightLabel;

    public StatusBar(ApplicationModel applicationModel) {
    	this.applicationModel = applicationModel;
    	String username="";
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(0, 25)); 
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        if(!applicationModel.getContext().getUser().getData().isEmpty())
        	username= (String) applicationModel.getContext().getUser().getData().get(0).get(6);
        leftLabel = new JLabel(" Prijavljen kao: " + username );
        //centerLabel = new JLabel(" Licenced as ", SwingConstants.CENTER);
        rightLabel = new JLabel(" Right Text ", SwingConstants.RIGHT);

        
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        leftPanel.add(leftLabel);
        //centerPanel.add(centerLabel);
        rightPanel.add(rightLabel);

        
        add(leftPanel, BorderLayout.WEST);
        //add(centerPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);
        
        updateDateTime();
    }

    
    private void updateDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        rightLabel.setText(formatter.format(new Date()));
    }

    protected void setLeftComponent(String text) {
        leftLabel.setText(" " + text + " ");
    }

    protected void setCenterComponent(String text) {
        centerLabel.setText(" " + text + " ");
    }

    protected void setRightComponent(String text) {
        rightLabel.setText(" " + text + " ");
    }


	@Override
	public void update(Subject applicationModel) {
		this.applicationModel = (ApplicationModel) applicationModel;
		this.repaint();
		this.revalidate();
	}
    
    

}
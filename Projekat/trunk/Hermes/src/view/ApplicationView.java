/***********************************************************************
 * Module:  ApplicationView.java
 * Author:  goran
 * Purpose: Defines the Class ApplicationView
 ***********************************************************************/

package view;

import model.ApplicationModel;

import javax.swing.UnsupportedLookAndFeelException;


import java.util.*;

import javax.swing.UIManager;
/**
 * Klasa za definisanje pogleda aplikacije.
 * 
 * @author Aleksej Mutić
 * @version 1.0
 */
public class ApplicationView {
   private ApplicationModel applicationModel;
   
   public LoginFrame authentification;
   public ApplicationView(ApplicationModel applicationModel) {
	   		this.applicationModel = applicationModel;
	 		try {
	 			com.jtattoo.plaf.fast.FastLookAndFeel.setTheme("Large-Font", "", "Hermes");
	 			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
	 			
	 		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
	 				| UnsupportedLookAndFeelException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	   
	   authentification = new LoginFrame(applicationModel, null);
	   
   }
   

}
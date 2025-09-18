package main;

import view.ApplicationView;

import model.ApplicationModel;

public class MainClass {
    public static void main(String[] args) {
    	
        ApplicationModel applicationModel = new ApplicationModel();
        ApplicationView applicationView = new ApplicationView(applicationModel);
    }
}
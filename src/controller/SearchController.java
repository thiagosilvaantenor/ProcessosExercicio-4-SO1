package controller;

import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class SearchController implements ActionListener {
	
	private JTextField textField;
	
	public SearchController(JTextField txt) {
		this.textField = txt;
	}
}

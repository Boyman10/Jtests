package com.ocr.button;

import java.awt.GridLayout; 

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPanel;

public class Fenetre extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3121102083951871112L;

	//private JPanel pan = new JPanel();
	//private JButton bouton = new JButton("Mon bouton");

	public Fenetre(){
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//Ajout du bouton à notre content pane
		/*pan.add(bouton);
		this.setContentPane(pan);
		 */
		this.setLayout(new GridLayout(3, 2));
		//On ajoute le bouton au content pane de la JFrame
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		this.setVisible(true);
	}       
}
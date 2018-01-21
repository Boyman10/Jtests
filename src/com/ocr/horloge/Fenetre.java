package com.ocr.horloge;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.ocr.horloge.model.Horloge;

import com.ocr.horloge.observer.Observer;

public class Fenetre extends JFrame {
	/**
	 * https://openclassrooms.com/courses/apprenez-a-programmer-en-java/interagir-avec-des-boutons
	 */
	private static final long serialVersionUID = -5784770826500140944L;

	private JLabel label = new JLabel();
	private Horloge horloge;

	public Fenetre(){
		//On initialise la JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(200, 80);

		//On initialise l'horloge
		this.horloge = new Horloge();
		//On place un �couteur sur l'horloge
		this.horloge.addObservateur(new Observer(){
			public void update(String hour) {
				label.setText(hour);
			}
		});

		//On initialise le JLabel
		Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
		this.label.setFont(police);
		this.label.setHorizontalAlignment(JLabel.CENTER);
		//On ajoute le JLabel � la JFrame
		this.getContentPane().add(this.label, BorderLayout.CENTER);		
		this.setVisible(true);
		this.horloge.run();
	}

	//M�thode main() lan�ant le programme
	public static void main(String[] args){
		Fenetre fen = new Fenetre();
	}
}
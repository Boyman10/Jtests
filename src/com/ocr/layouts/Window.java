package com.ocr.layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

/**
 * Working on different layouts
 * @author bob
 * @version 1.0.1
 * https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/index.html#BoxAlignmentDemo
 */
public class Window extends JFrame implements ActionListener {


	private static final long serialVersionUID = 3121102083951871112L;
	JLabel simple;
	JPanel midPan;
	
	public Window(){
		
		this.setTitle("Layouts");
		this.setSize(700, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// The default content pane is a simple intermediate container that inherits from JComponent, and that uses a BorderLayout as its layout manager.
		// The getContentPane method returns a Container object, not a JComponent object
		Container container = this.getContentPane();
		
		// Each JPanel object is initialized to use a FlowLayout
		
		/**
		 * FlowLayout -- default behavior
		 */
		JPanel panBorder = new JPanel();
		panBorder.setLayout(new FlowLayout());
		panBorder.setBackground(Color.white);
		simple = new JLabel("Here is my phrase");
		simple.setOpaque(true); // So we can use bg colors

		JLabel second = new JLabel("Following these words...");
		panBorder.add(simple);
		panBorder.add(second);
		
		/**
		 * Grid layout
		 */
		JPanel panGrid = new JPanel();
		panGrid.setLayout(new GridLayout(3, 2));
		panGrid.setBackground(Color.cyan);
		panGrid.add(new JButton("1"));
		panGrid.add(new JButton("2"));
		panGrid.add(new JButton("3"));
		panGrid.add(new JButton("4"));
		panGrid.add(new JButton("5"));
		
		/**
		 * Box Layout
		 * The Swing packages include a general purpose layout manager named BoxLayout. 
		 * BoxLayout either stacks its components on top of each other or places them in a row 
		 * — your choice. You might think of it as a version of FlowLayout, but with greater functionality.
		 */
		JPanel panBox = new JPanel();
		//Lay out the label and scroll pane from top to bottom.
		panBox.setLayout(new BoxLayout(panBox, BoxLayout.Y_AXIS));
		panBox.setBackground(Color.gray);
		
		// Padding :
		panBox.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JLabel newSimple = new JLabel("My Brand new Text");
		JLabel newSecond = new JLabel("should be in the middle center");
		
		//newSimple.setHorizontalAlignment(SwingConstants.CENTER);
		panBox.add(newSimple);
		panBox.add(newSecond);
		
		// Middle panel to include 3 test panels with different layouts :
		midPan = new JPanel();
		midPan.setLayout(new BoxLayout(midPan, BoxLayout.PAGE_AXIS));
		
		midPan.add(panBorder);
		midPan.add(panGrid);
		midPan.add(panBox);		
		
		newSimple.setAlignmentX(CENTER_ALIGNMENT);
		newSecond.setAlignmentX(CENTER_ALIGNMENT);
		container.add(midPan, BorderLayout.CENTER);
		
		
		/**
		 * Border Layout for container -- default
		 */
		
		JButton button = new JButton("Button 1 (PAGE_START)");
		container.add(button, BorderLayout.PAGE_START);

		button = new JButton("Button 3 (LINE_START)");
		container.add(button, BorderLayout.LINE_START);

		button = new JButton("Long-Named Button 4 (PAGE_END)");
		container.add(button, BorderLayout.PAGE_END);

		button = new JButton("5 (LINE_END)");
		container.add(button, BorderLayout.LINE_END);
		
		button.setBackground(Color.BLACK);
		button.setForeground(Color.white);
		
		button.addActionListener(this);
		
		//Create a split pane with the two scroll panes in it.
	    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
	    		panBorder, panGrid);
	    splitPane.setOneTouchExpandable(true);
	    splitPane.setDividerLocation(150);

	    midPan.add(splitPane);
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton but = (JButton)e.getSource();
		
		but.setBackground(Color.blue);
		simple.setBackground(Color.green);
	}       
}
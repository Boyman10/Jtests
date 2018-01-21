package com.oc.jdbc.tp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = -4424685005194247131L;
	private JToolBar toolbar;
	private JButton jToolbarButton ;
	private JScrollPane pane, paneTable;
	
	public MyWindow() {

		this.setTitle("Test SQL");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    toolbar = new JToolBar();
	    toolbar.setRollover(true);
	    	    	    
	    
	    ImageIcon imageIcon = new ImageIcon("images/right.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(32, 32,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
        imageIcon = new ImageIcon(newimg);  // transform it back

        jToolbarButton = new JButton(imageIcon);
        
        
	    jToolbarButton.setToolTipText("right");
	    jToolbarButton.setPreferredSize(new Dimension(32,32));
	    jToolbarButton.addActionListener(new ActionListener() {
	    
	    
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    toolbar.add(jToolbarButton);
		
		
		
	    Container contentPane = this.getContentPane();
	    
	    contentPane.add(toolbar, BorderLayout.NORTH);
	    
	    
	    JTextArea textArea = new JTextArea();
	    pane = new JScrollPane(textArea);
	    JTable table = new JTable();
	    paneTable = new JScrollPane(table);
	    
	    contentPane.add(pane, BorderLayout.CENTER);
	    contentPane.add(paneTable, BorderLayout.SOUTH);

	  //Create a split pane with the two scroll panes in it.
	    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
	                               pane, paneTable);
	    splitPane.setOneTouchExpandable(true);
	    splitPane.setDividerLocation(150);
		
		add(splitPane, BorderLayout.CENTER);

	    this.setSize(750, 450);
	    this.setVisible(true);
	}
	

}

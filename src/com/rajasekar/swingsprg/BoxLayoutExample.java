package com.rajasekar.swingsprg;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoxLayoutExample extends JFrame {

	public static void main(String[] args) {
		  BoxLayoutExample mainFrame = new BoxLayoutExample();
		  mainFrame.setTitle("Simple example");
		  mainFrame.setSize(1000, 1000);
		  mainFrame.setLocationRelativeTo(null);
		  mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  
		  JPanel jpanel = new JPanel();
		  jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
		  jpanel.add(new JLabel("rajasekar"));
		  Box box = Box.createHorizontalBox();
		  box.setPreferredSize(new Dimension(10, 10));
		  box.add(new JTextField("adfasdf"));
		  box.setSize(new Dimension(10, 10));
		  jpanel.add(box);
		 
		  
		  jpanel.add(new JLabel("rajasekar1"));
		  jpanel.add(Box.createRigidArea(new Dimension(100, 100)));
		  //jpanel.add(new JTextField("   "));
		  mainFrame.add(jpanel);
		  mainFrame.setVisible(true);
		  
	}

}

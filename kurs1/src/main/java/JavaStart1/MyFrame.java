package JavaStart1;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	JButton b1, b2, b3 ; 
	
	
	public MyFrame() {
		setSize(300, 100);
		setTitle("Jakaś nazwa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(750, 300);
//		setLayout(new FlowLayout());
		setLayout(new GridLayout());
		
		setVisible(true);
		
		b1 = new JButton("Przycisk 1"); 
		add (b1); 
		
		b2 = new JButton("Przycisk 2"); 
		add (b2); 
		
		b3 = new JButton("Przycisk 3"); 
		add (b3); 
	}

}

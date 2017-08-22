package Pole_tekstowe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CelciusToFarenheit extends JFrame implements ActionListener{
	JLabel lCelcius, lFarenheit; 
	JTextField tCelcius, tFarenheit ;
	JButton bKonwertuj ; 
	double tempCelcius , tempFarenheit; 
	
	
	
	public CelciusToFarenheit() {
		setSize (400, 200); 
		setTitle ("Przeliczanie stopni Celcjuszaz na Farenheita");
		setLayout(null); 
		
		lCelcius = new JLabel("Stopnie Celcjusza:");
				lCelcius.setBounds(20 ,30 , 150, 20);
				add(lCelcius) ;
				
		tCelcius = new JTextField("") ;
		tCelcius.setBounds(170, 30, 150, 20);
		add(tCelcius) ; 
		
		lFarenheit = new JLabel("Stopnie Celcjusza:");
		lFarenheit.setBounds(20 , 70 , 150, 20);
		add(lFarenheit) ;
		
		tFarenheit = new JTextField("") ;
		tFarenheit.setBounds(170, 70, 150, 20);
		add(tFarenheit) ; 
		
		bKonwertuj = new JButton("konwertuj") ;
		bKonwertuj.setBounds(20 , 110, 100 , 20);
		bKonwertuj.addActionListener(this);
		add(bKonwertuj);
		
	}
	
	public static void main (String []args) {
		
		CelciusToFarenheit aplikacja = new CelciusToFarenheit(); 
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		tempCelcius = Double.parseDouble(tCelcius.getText()); 
		tempFarenheit = 32.0 + (9.0 / 5.0) * tempCelcius; 
		tFarenheit.setText(String.valueOf(tempFarenheit));
	}
	
	

}

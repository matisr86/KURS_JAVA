package Pole_tekstowe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.omg.CORBA.TCKind;

public class CelciusToFarenheit1 extends JFrame implements ActionListener{
	private JLabel lCelcius, lFarenheit; 
	private JTextField tCelcius, tFarenheit ;
	private JButton bKonwertuj ; 
	private ButtonGroup bgWybor; 
	private JRadioButton rbCelToFar, rbFarToCel ;
	private double tempCelcius , tempFarenheit; 
	
	
	
	public CelciusToFarenheit1() {
		setSize (400, 400); 
		setTitle ("Przeliczanie stopni Celcjuszaz na Farenheita");
		setLayout(null); 
		
		lCelcius = new JLabel("Stopnie Celcjusza:");
				lCelcius.setBounds(20 ,30 , 150, 20);
				add(lCelcius) ;
				
		tCelcius = new JTextField("") ;
		tCelcius.setBounds(170, 30, 150, 20);
		tCelcius.addActionListener(this);
		tCelcius.setToolTipText("Podj temperaturę w stopniach Celcjusza");
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
		

		
		bgWybor = new ButtonGroup(); 
		rbCelToFar = new JRadioButton("Celcjusz => Farenheit"); 
		rbCelToFar.setBounds(150 , 140, 150 , 20);
		rbCelToFar.setSelected(true);
		bgWybor.add(rbCelToFar);
		add(rbCelToFar); 
		
		
		
		bgWybor = new ButtonGroup(); 
		rbFarToCel = new JRadioButton("Farenheit => Celcius"); 
		rbFarToCel.setBounds(150 , 160, 150 , 20);
		bgWybor.add(rbFarToCel);
		add(rbFarToCel); 
		
		
		
	}
	
	public static void main (String []args) {
		
		CelciusToFarenheit1 aplikacja = new CelciusToFarenheit1(); 
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		Object zrodlo =e.getSource();
		
		if(zrodlo ==rbCelToFar){
			if(zrodlo ==bKonwertuj || zrodlo == tCelcius) {				
				tempCelcius = Double.parseDouble(tCelcius.getText()); 
				tempFarenheit = 32.0 + (9.0 / 5.0) * tempCelcius; 
				tFarenheit.setText(String.valueOf(tempFarenheit));
				}				
			
			}
		else if (zrodlo == rbFarToCel){
			if(zrodlo ==bKonwertuj || zrodlo == tCelcius) {
				tempCelcius = Double.parseDouble(tCelcius.getText()); 
				tempCelcius = (32.0 + (9.0 / 5.0)) / tempFarenheit; 
				tCelcius.setText(String.valueOf(tempCelcius));
				}	
			
		}
		
		
	}
	
	

}

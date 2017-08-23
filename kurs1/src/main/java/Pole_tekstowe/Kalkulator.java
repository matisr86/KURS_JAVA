package Pole_tekstowe;

import java.awt.RadialGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Kalkulator extends JFrame implements ActionListener{
	
	private JLabel lCelcius, lFarenheit ; 
	private JTextField tCelcus , tFarenheit; 
	private JButton bKonwertuj; 
	private ButtonGroup bgWybor;
	private JRadioButton rbCelToFar, rbFarToCel ; 
	private double tempCelcius, tempFarenheit; 
	
	public Kalkulator () {
		setSize (400, 300) ;
		setTitle ("Kalkulator");
		setLayout(null) ;
		
		lCelcius = new JLabel("Stopnie Celciusza: ");
		lCelcius.setBounds(20 , 20, 150, 20);
		add(lCelcius) ; 
		
		tCelcus = new JTextField(""); 
		tCelcus.setBounds(170, 20, 150, 20);
		add(tCelcus); 
		
		
		
		lFarenheit = new JLabel("Stopnie Farenheita: ");
		lFarenheit.setBounds(20 , 50, 150, 20);
		add(lFarenheit) ; 
		
		tFarenheit = new JTextField(""); 
		tFarenheit.setBounds(170, 50, 150, 20);
		add(tFarenheit); 
		
		bKonwertuj = new JButton("Zamień"); 
		bKonwertuj.setBounds(20, 110, 150 , 20);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
		bgWybor = new ButtonGroup(); 
		
		rbCelToFar = new JRadioButton("Celcjusz => Farenheit", true); 
		rbCelToFar.setBounds(20, 80, 150 ,20);
		bgWybor.add(rbCelToFar);
		add(rbCelToFar); 
		
		rbFarToCel = new JRadioButton("Farenheit => Celcius", false); 
		rbFarToCel.setBounds(180, 80, 150 ,20);
		bgWybor.add(rbFarToCel);
		add(rbFarToCel); 
		
		
		
	}
	public static void main (String [] args){
		Kalkulator aplikacja =new Kalkulator(); 
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
	


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (rbCelToFar.isSelected()) {
			tempCelcius = Double.parseDouble(tCelcus.getText()); 
			tempFarenheit =(9.0 / 5.0) * tempCelcius + 32.0; 
			tFarenheit.setText(String.valueOf(tempFarenheit)); 
		}
		else if (rbFarToCel.isSelected()) {
			tempFarenheit = Double.parseDouble(tFarenheit.getText()); 
			tempCelcius = 5.0 / 9.0 * (tempFarenheit - 32.0)  ;
			tCelcus.setText(String.valueOf(tempCelcius));
		}
	}
	
	
	
	
	
}

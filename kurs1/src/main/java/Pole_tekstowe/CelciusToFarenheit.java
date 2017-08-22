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

public class CelciusToFarenheit extends JFrame implements ActionListener{
	private JLabel lCelcius, lFarenheit; 
	private JTextField tCelcius, tFarenheit ;
	private JButton bKonwertuj ; 
	private JCheckBox chWielkie; 
	private ButtonGroup bgRozmiar; 
	private JRadioButton rbMaly, rbSredni, rbDuzy ;
	private double tempCelcius , tempFarenheit; 
	
	
	
	public CelciusToFarenheit() {
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
		
		chWielkie = new JCheckBox("Wielkie litery") ;
		chWielkie.setBounds(150 , 110, 100 , 20);
		chWielkie.addActionListener(this);
		add(chWielkie);
		
		bgRozmiar = new ButtonGroup(); 
		rbMaly = new JRadioButton("Mały", true); 
		rbMaly.setBounds(150 , 140, 100 , 20);
		bgRozmiar.add(rbMaly);
		add(rbMaly); 
		rbMaly.addActionListener(this);
		
		
		rbSredni = new JRadioButton("Średni", false); 
		rbSredni.setBounds(150 , 160, 100 , 20);
		bgRozmiar.add(rbSredni);
		add(rbSredni); 
		rbSredni.addActionListener(this);
		
		rbDuzy = new JRadioButton("Duży", false); 
		rbDuzy.setBounds(150 , 180, 100 , 20);
		bgRozmiar.add(rbDuzy);
		add(rbDuzy);  
		rbDuzy.addActionListener(this);
	}
	
	public static void main (String []args) {
		
		CelciusToFarenheit aplikacja = new CelciusToFarenheit(); 
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		Object zrodlo =e.getSource();
		
		if(zrodlo ==bKonwertuj || zrodlo == tCelcius) {
			
		tempCelcius = Double.parseDouble(tCelcius.getText()); 
		tempFarenheit = 32.0 + (9.0 / 5.0) * tempCelcius; 
		tFarenheit.setText(String.valueOf(tempFarenheit));
		}
		
		else if (zrodlo == chWielkie ) {
			if(chWielkie.isSelected() == true) {
				tFarenheit.setFont(new Font ("SansSerif", Font.BOLD, 18));
			}
			else {
				tFarenheit.setFont(new Font ("SansSerif", Font.PLAIN, 12));
			}
		}
		
		else if (zrodlo == rbMaly) {
			tFarenheit.setFont(new Font ("SansSerif", Font.PLAIN, 12));
		}
		
		else if (zrodlo == rbSredni) {
			tFarenheit.setFont(new Font ("SansSerif", Font.PLAIN, 16));
		}
		else if (zrodlo == rbDuzy) {
			tFarenheit.setFont(new Font ("SansSerif", Font.PLAIN, 20));
		}
	}
	
	

}

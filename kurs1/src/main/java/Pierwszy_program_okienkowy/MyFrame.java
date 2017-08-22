package Pierwszy_program_okienkowy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
  JButton bPodajDate, bWyjscie;
  JLabel lWyswietlDate; 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(){
		setSize(600 ,200); 
		setTitle("Moje pierwsze okienko");
		setLayout(null);
		
		bPodajDate = new JButton ("Podaj datę");
		bPodajDate.setBounds(150,100,100,20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);
		
		bWyjscie = new JButton ("Wyjście");
		bWyjscie.setBounds(250,100,100,20);
		bWyjscie.addActionListener(this);
		add(bWyjscie);
		
		lWyswietlDate = new JLabel ("Data: "); 
		lWyswietlDate.setBounds(150, 50, 350, 20);
		lWyswietlDate.setForeground(Color.CYAN);
		lWyswietlDate.setFont(new Font("SansSerif", Font.BOLD, 20));
		add(lWyswietlDate) ;
	}

	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource() ;
		if (zrodlo == bPodajDate){
			lWyswietlDate.setText(new Date().toString());
			// System.out.println(new Date());
			}
		else if(zrodlo == bWyjscie) {
			dispose(); 
		}
	}
	
  
    }

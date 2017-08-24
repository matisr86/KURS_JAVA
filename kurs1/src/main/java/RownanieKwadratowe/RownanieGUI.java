package RownanieKwadratowe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RownanieGUI extends JFrame implements ActionListener{
	
private JTextField tA, tB, tC, tWynik;
private JLabel 	lA, lB, lC, lWynik ; 
private JButton bWyjscie , bRozwiaz ; 

	
	public RownanieGUI (){
		setSize(400,200) ; 
		setTitle("Rozwiązanie równania kwadratowego") ;
		setLayout(null);
		
		lA= new JLabel("a", JLabel.RIGHT) ;
		lA.setBounds(20 , 20 ,20 ,20);
		add(lA); 
		
		tA = new JTextField();
		tA.setBounds(50, 20, 50 , 20);
		tA.setToolTipText("Podaj liczbę a");
		add(tA) ;
		
		lB = new JLabel("b", JLabel.RIGHT) ; 
		lB.setBounds(20, 50, 20,20 );
		add(lB); 
		
		tB = new JTextField() ; 
		tB.setBounds(50 , 50, 50, 20); 
		tB.setToolTipText("Podaj liczbę b");
		add(tB); 
		
		lC = new JLabel("c", JLabel.RIGHT) ;
		lC.setBounds(20, 80, 20, 20);
		add(lC); 
		
		tC = new JTextField() ; 
		tC.setBounds(50, 80, 50, 20);
		tC.setToolTipText("Podaj liczbę C");
		add(tC); 
		
		bRozwiaz = new JButton("Rozwiąż"); 
		bRozwiaz.setBounds(150 , 40 , 150 , 20);
		bRozwiaz.addActionListener(this);
		add(bRozwiaz); 
		
		bWyjscie = new JButton("Wyjście") ; 
		bWyjscie.setBounds(150 , 70, 150, 20);
		bWyjscie.addActionListener(this);
		add(bWyjscie) ; 
		
		
		lWynik = new JLabel("Wynik: ", JLabel.RIGHT); 
		lWynik.setBounds(0, 120, 80, 20);
		add(lWynik);
		
		tWynik = new JTextField();
		tWynik.setBounds(80, 120, 250, 20);
		add(tWynik) ;
		
	}
	
	

public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object zrodlo = e.getSource(); 
		
		if (zrodlo == bWyjscie) {
			
			dispose(); 
		}
		
		else if (zrodlo == bRozwiaz) {
			
			int a = Integer.parseInt(tA.getText()) ;
			int b = Integer.parseInt(tB.getText()) ;
			int c = Integer.parseInt(tC.getText()) ;
			
			RownanieKwadratowe rownanie = new RownanieKwadratowe(a, b, c) ;
			String rozwiazanie; 
			rozwiazanie = rownanie.rozwiaz(); 
			
			tWynik.setText(rozwiazanie);
			
		}
	}



public static void main (String [] args) {
	RownanieGUI app = new RownanieGUI() ; 
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.setVisible(true);
	
}
}

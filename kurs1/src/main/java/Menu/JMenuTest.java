package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;




public class JMenuTest extends JFrame implements ActionListener{

	JMenuBar menuBar ;
	JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje; 
	JMenuItem mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mOProgramie, mOpcja1; 
	JCheckBoxMenuItem chOpcja2;
	
	
	public JMenuTest () {
		
		setTitle("Demonstracja Menu");
		setSize(800 , 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		menuBar = new JMenuBar(); 
		
		
		menuPlik = new JMenu("Plik"); 
		mOtworz = new JMenuItem("Otwórz", 'O');
		mZapisz = new JMenuItem("Zapisz");
		mWyjscie = new JMenuItem("Wyjście"); 
		
		menuPlik.add(mOtworz); 
		menuPlik.add(mZapisz) ;
		menuPlik.addSeparator();
		menuPlik.add(mWyjscie) ;
		
		mWyjscie.addActionListener(this);
		mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		
		menuNarzedzia = new JMenu("Narzędzia");
		
		mNarz1 = new JMenuItem("Narz1") ;
		mNarz1.setEnabled(false);
		mNarz2 = new JMenuItem("Narz2") ;
		
		menuNarzedzia.add(mNarz1);
		menuNarzedzia.add(mNarz2); 
		
		
		
			menuOpcje = new JMenu("Opcje");
			mOpcja1 = new JMenuItem("Opcja 1"); 
			chOpcja2 = new JCheckBoxMenuItem("Opcja 2");
			chOpcja2.addActionListener(this);
			
			menuOpcje.add(mOpcja1);
			menuOpcje.add(chOpcja2);
		menuNarzedzia.add(menuOpcje); 	
		
		
		setJMenuBar(menuBar);
		menuBar.add(menuPlik); 
		menuBar.add(menuNarzedzia); 
		
		menuBar.add(Box.createHorizontalGlue()); 
		menuPomoc = new JMenu("Pomoc");
		mOProgramie = new JMenuItem("O programie") ; 
		mOProgramie.addActionListener(this);
		
		
		menuPomoc.add(mOProgramie); 
		
		
	
		
		
		
		menuBar.add(menuPomoc); 
		
		
		
	
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object zrodlo = e.getSource(); 
		
		if (zrodlo == mWyjscie){
			dispose();
		}
		else if(zrodlo == chOpcja2) {
			if(chOpcja2.isSelected()){
				mNarz1.setEnabled(true);
			}
			else
				mNarz1.setEnabled(false);
		}
		else if (zrodlo == mOProgramie){
			JOptionPane.showMessageDialog(this, "Program demostruje użycie menu \n Wersja 1.0.");
		}
		}

	
	
	
	public static void main (String [] args) {
		JMenuTest app = new JMenuTest() ; 
		app.setVisible(true);
		
	}
	
	
}

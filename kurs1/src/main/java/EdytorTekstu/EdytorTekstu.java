package EdytorTekstu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class EdytorTekstu extends JFrame implements ActionListener{
	
	JMenuBar menuBar; 
	JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje ;
	JMenuItem  mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mOProgramie, mOpcja1, mpKopiuj, mpWklej, mpDolacz; 
	JTextArea notatnik;
	JScrollPane scrollPane;
	JButton bSzukaj; 
	JTextField tSzukany; 
	JPopupMenu popUp ; 
	String wybranyTekst; 
	
	
	public EdytorTekstu () {
		setTitle("Edytor Tekstu");
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		menuBar = new JMenuBar() ; 
		setJMenuBar(menuBar);
		
		
		
		menuPlik = new JMenu("Plik") ; 
		menuBar.add(menuPlik);
		
		mOtworz = new JMenuItem("Otwórz" , 'o');
		menuPlik.add(mOtworz);
		mOtworz.addActionListener(this);
		
		mZapisz = new JMenuItem("Zapisz", 'z'); 
		menuPlik.add(mZapisz);
		mZapisz.addActionListener(this);
		 
		mWyjscie = new JMenuItem("Wyjście", 'w'); 
		menuPlik.add(mWyjscie); 
		mWyjscie.addActionListener(this);
		mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		
		
		
		menuNarzedzia = new JMenu("Narzędzia"); 
		menuBar.add(menuNarzedzia); 
		
		mNarz1 = new JMenuItem("Narzędzia 1"); 
		menuNarzedzia.add(mNarz1);
		
		mNarz2 = new JMenuItem("Narzędzia 2");
		menuNarzedzia.add(mNarz2); 
		
		menuOpcje = new JMenu("Opcje");
		menuBar.add(menuOpcje);
		
		mOpcja1 = new JMenuItem("Opcja 1");
		menuOpcje.add(mOpcja1);
		
		
		
		menuBar.add(Box.createHorizontalGlue()); 
		menuPomoc = new JMenu("Pomoc");
		menuBar.add(menuPomoc);
		
		mOProgramie = new JMenuItem("O programie");
		menuPomoc.add(mOProgramie); 
		mOProgramie.addActionListener(this);
		
		
		notatnik = new JTextArea();
		scrollPane = new JScrollPane(notatnik); 
		scrollPane.setBounds(0, 0, 580, 580);
		add(scrollPane);
		
		tSzukany = new JTextField(); 
		tSzukany.setBounds(10, 600, 250, 20);
		add(tSzukany); 
		
		bSzukaj = new JButton("Szukaj");
		bSzukaj.setBounds(290, 600, 100, 20);
		bSzukaj.addActionListener(this);
		add(bSzukaj); 
		
		popUp = new JPopupMenu(); 
		mpKopiuj = new JMenuItem("Kopiuj"); 
		mpKopiuj.addActionListener(this);
		
		mpWklej = new JMenuItem("Wklej");
		mpWklej.addActionListener(this);
		
		mpDolacz = new JMenuItem("Dołącz");
		mpDolacz.addActionListener(this);
		
		popUp.add(mpKopiuj);
		popUp.add(mpWklej); 
		popUp.add(mpDolacz); 
		
		notatnik.setComponentPopupMenu(popUp);
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource(); 
		
		if (zrodlo == mWyjscie) {
			dispose(); 
		}
		
		else if(zrodlo == mOProgramie) {
			JOptionPane.showMessageDialog(this, "Program do edycji tekstu. Wersja 1.0");	
		}
		
		else if(zrodlo == mOtworz) {
			JFileChooser fc = new JFileChooser(); 
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				File plik = fc.getSelectedFile(); 		
				try {
					Scanner skaner = new Scanner(plik);
					while (skaner.hasNextLine())
						notatnik.append(skaner.nextLine() + "\n");
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		else if (zrodlo == mZapisz) {
			JFileChooser fc = new JFileChooser(); 
			if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				File plik = fc.getSelectedFile();
				try {
					PrintWriter pw = new PrintWriter(plik);
					Scanner skaner = new Scanner(notatnik.getText()); 
					while (skaner.hasNextLine()) {
						pw.println(skaner.nextLine() + "\n");
						
					pw.close();
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		}
		
		else if (zrodlo == bSzukaj) {
			String tekst = notatnik.getText(); 
			String szukane = tSzukany.getText(); 
			String wystapienia = ""; 
			int i = 0; 
			int index; 
			int startIndex= 0 ; 
			
		while ((index = tekst.indexOf(szukane, startIndex)) != -1) {
			startIndex = index + szukane.length() ; 
			i++; 
			wystapienia = wystapienia + " " + index; 
		}
		
		JOptionPane.showMessageDialog(null, szukane + " wystąpiło "+ i + " razy:" + wystapienia );
		}
		
		else if (zrodlo == mpKopiuj) {
			wybranyTekst = notatnik.getSelectedText();
		}
		else if (zrodlo == mpWklej) {
			notatnik.insert(wybranyTekst, notatnik.getCaretPosition());
		}
		
		else if (zrodlo == mpDolacz)
			notatnik.append("\n" + wybranyTekst);
	}




	public static void main (String [] args) {
		
		EdytorTekstu app = new EdytorTekstu(); 
		app.setVisible(true);
	}

}

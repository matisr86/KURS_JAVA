package zadania;

import java.util.Random;

import ZamowieniaGUI.main;

public class z2_1 {
	/* 1. Napisać program, który utworzy tablicę 10 liczb całkowitych i wypełni ją warto-
ściami losowymi z przedziału [−10, . . . , 10], a następnie:
a) wypisze na ekranie zawartość tablicy,
b) wyznaczy najmniejszy oraz największy element w tablicy,
c) wyznaczy średnią arytmetyczną elementów tablicy,
d) wyznaczy ile elementów jest mniejszych, ile większych od średniej.
e) wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego
do pierwszego.
Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
*/
	
	public static void main(String[] args) {
		int [] tab= new int [10] ; 
		int min, max = 0, suma = 0 , mniejsz = 0, wieksza = 0;
		double  srednia = 0.0 ; 
		Random r = new Random(); 
		
		
		for( int i = 0 ; i <10 ; i ++) {
			tab[i] = r.nextInt(21) -10 ; 
		}
	
		for (int x : tab)
			System.out.println("Elemęt : " + x);
		
		
		max = tab[0];
		for (int i = 1 ; i < tab.length ; i++) {
			
			if (tab[i] > max)
				max = tab[i];
		}
		
		System.out.println("Największa wylosowana liczba to :" + max);
		
		min = tab[0];
		for (int i = 1; i < tab.length ; i++) {
			if (tab[i] < min)
				min = tab[i]; 
		}
		System.out.println("Najmniejsza wylosowana wartość to: " + min);
		for ( int i = 0 ; i < tab.length ; i ++) {
			suma= suma + tab[i]; 
			}
		
		srednia = suma / 10.0 ; 
		
		System.out.println("Średnia arytmetyczna wylosowanych liczb to: " + srednia + " suma: " + suma );

	
		for (int i= 0 ; i < tab.length; i++) {
			if (tab [i] < srednia) {
				mniejsz += 1 ; 
			}
			else if (tab[i] > srednia) {
				wieksza += 1 ; 
			}
		}
		System.out.println("Wylosowano " + mniejsz + " mniejszych niż średnia i " + wieksza + " większych");
		
		for (int i = 9 ; i >= 0 ; i-- ) {
			System.out.println("Elemęt w odwrotnej kolejności: " + tab[i]);
		}
		
	}
	
}

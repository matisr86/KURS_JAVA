package zadania;

import java.util.Random;

/*
 * 3. Napisz program, który stworzy tablicę m (macierz) 5 x 5 liczb całkowitych i
wypełnij ją losowymi wartościami z zakresu {−5, −4, . . . , 5}, a następnie:
a) wyświetli na ekranie wylosowaną macierz,
b) wyświetli minimalną wartość w każdym wierszu,
c) wyświetli maksymalną wartość w każdej kolumnie,
d) wyświetli maksimum dla 1. przekątnej, czyli od komórki m[0][0] do komórki
m[4][4] ,
e) wyświetli minimum dla 2. przekątnej, czyli od komórki m[0][4] do komórki
m[4][0] .
 */
public class z2_3 {

	public static void main(String[] args) {
		int tab[][] = new int [5][5] ; 
		int minWiersz = 0 ; 
		int maxWiersz = 0; 
		int minKolumna = 0 , maxKolumna = 0, minPzekatna = 0 , maxPrzekatna = 0; 
		
		Random r = new Random();
		
		for (int i = 0 ; i < tab.length ; i++) { 
			for( int j = 0 ; j < tab.length ; j ++ ) { 
				tab[i][j] = r.nextInt(11) -5 ; 
			}	
		}
		
		
		
		for (int i = 0 ; i < tab.length ; i ++ ) { 
			
			if ( tab [i][0] >= 0 ){
				System.out.print(" ");
			}
			System.out.print(tab[i][0]);
			minWiersz = tab [i][0]; 
			maxWiersz = tab [i][0]; 
		
			
			for( int j = 1 ; j < tab.length ; j ++ ) {
				
				if (minWiersz > tab [i][j])
					minWiersz = tab [i][j]; 
				
				
				if (maxWiersz < tab [i][j])
					maxWiersz = tab [i][j]; 
				
				
				if ( tab[i][j] < 0 ) {
					System.out.print("  " + tab[i][j]);
				}
				else
					System.out.print("   " + tab[i][j]);
				
				
			}
			System.out.println("      minimalna wartość wiersza to : " + minWiersz + ", a maksymalna wartość to: " + maxWiersz ); 
		}
		
		
		for ( int i = 0 ; i < tab.length ; i++) {
			maxKolumna = tab [0][i] ;
			minKolumna = tab [0][i]; 
			for ( int j = 0 ; j < tab.length ; j++) { 
				if ( maxKolumna < tab [j][i]) 
					maxKolumna = tab[j][i];
				
				if ( minKolumna > tab [j][i]) 
					minKolumna = tab[j][i];
					
			}
			System.out.println("Kolumna" + (i+1) + " Max : " + maxKolumna + " Min : " + minKolumna);
		}
		
		for (int i = 0 ; i < tab.length ; i ++ ) {
			minPzekatna = tab [0][0];
			maxPrzekatna = tab [0][0];
			for (int j = 0 ; j < tab.length; j++) { 
				if ( i == j) { 
					if(minPzekatna > tab[i][j]) { 
						minPzekatna = tab [i][j];
					}
					
				}
				System.out.println("Minimalna wartość przekątnej to: " + minPzekatna);
			}
			
		}
		
		
	}

}

package zadania;

import java.util.Random;

/*
 * . Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
się w tablicy.
 */

public class z2_2 {

	public static void main(String[] args) {
		int [] tab = new int [20] ; 
		int z = 0; 
		
		Random r = new Random() ; 
		
		for ( int i = 0 ; i < tab.length ; i++) {
			tab[i] = r.nextInt(10) + 1 ; 
		}
		
		for (int x : tab) {
			System.out.println("Elemęt: " + x );
		}
		
		for ( int i = 0 ; i < tab.length ; i ++) {
			for (int x = 0 ; x < tab.length ; x++) {
				if (tab[i] == tab[x]) { 
					z+=1; 
					}				 
			}
			System.out.println(tab[i] + " została wylosowana " + z + " razy.");
				z = 0 ;
		}
	}

}

package zadania;

import java.util.Scanner;

public class z8 {
 /*
  * Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo,
dla liczby 21 dzielniki to: 1, 3, 7, 21.
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String wynik=""; 
		
		System.out.println("Podaj liczbę, której chesz poznać dzielniki: ");
		int liczba = sc.nextInt(); 
		
		for ( int  i=1 ; i <= liczba; i++ ) { 
			if (liczba%i == 0)
				wynik+= i +", " ; 
		}
		System.out.println("Liczba " + liczba + " posiada następujące dzielniki: " + wynik);
	}

}

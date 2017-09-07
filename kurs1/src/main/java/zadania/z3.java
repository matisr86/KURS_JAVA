package zadania;

import java.util.Scanner;

public class z3 {
// Pobiera liczbę i wyświetla potęgę liczby 2 nie większą niż pobrana liczba 
	
	public static void main(String[] args) {
		int a, wynik = 1; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Podaj dowolną liczbę całkowitą: ");
		a = sc.nextInt() ;
		
		do {
			wynik = wynik * 2; 
		}while (wynik < a); 
	System.out.println(wynik / 2);
	
	wynik =01 ; 
	while ( wynik < a ) {
		wynik = wynik * 2; 
	}
	System.out.println(wynik / 2 );
}
}

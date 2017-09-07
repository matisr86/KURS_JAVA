package zadania;

import java.util.Scanner;

public class z4 {
/* 
 * Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki
nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych
liczb.
	*/
	public static void main(String[] args) {
		int wynik = 0, liczba ; 
		
		Scanner sc = new Scanner(System.in) ;
		
		do {
			System.out.println("Podaj dowolną liczbe całkowitą: ");
			liczba = sc.nextInt() ; 
			wynik += liczba; 
		}while (liczba != 0); 
		System.out.println(wynik);
	}

}

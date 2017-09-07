package zadania;

import java.util.Random;
import java.util.Scanner;

public class z6 {

/*
 *  Gra w „Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
(użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
wartości. Jeżeli podana wartość jest:
• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
• identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
się kończy
 * 
 */
	
	public static void main(String[] args) {
		Random r = new Random(); 
		int liczba, a ; 
		Scanner sc = new Scanner (System.in) ; 
		
		
		liczba = r.nextInt(100) +1 ; 
		System.out.println("Komputer wlaśnie wylosował liczbę z przedzialu 1 - 100. Postaraj się odgadnąć jak to liczba :)");
		System.out.println("Podaj liczbę: ");
		 
		do {
			a= sc.nextInt(); 
			if (a > liczba) {
				System.out.println("Podałeś większą liczbę niż wylosowana, podaj liczbę ponownie");
				
			}
			else if (a < liczba) {
				System.out.println("Podałeś mniejszą liczbę niż wylosowana, podaj liczbę ponownie");
				
			}
			else if ( a == liczba ) {
				System.out.println("Podałeś prawidłową liczbę! ");
			}
		}while (a !=liczba); 
	}

}

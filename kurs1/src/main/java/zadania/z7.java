package zadania;

import java.util.Scanner;

public class z7 {
/*
 * Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie
prostokąt. Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego
górnego rogu prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
 */
	public static void main(String[] args) {
		int x , y, wielkosc; 
		String znak;  
		String spacja = " "; 
		String nowaLinia = ">" ; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Podaj współrzędne wypełnienia, jego wielkość oraz znak jakiego mamy użyć \n Podaj współrzędną x");
		x  = sc.nextInt(); 
		System.out.println("Podaj współrzędną y: ");
		y = sc.nextInt() ;
		System.out.println("Podaj wilkość pola");
		wielkosc = sc.nextInt(); 
		System.out.println("Podaj znak jakim chcesz wypelnić pole: ");
		znak = sc.next(); 
		for  (int iy = 1 ; iy < y ; iy++)
			System.out.println("");
		for ( int i = 0 ; i <wielkosc ; i++ ) {			
			for (int ix= 1 ; ix < x ; ix ++)
				System.out.print(spacja);
			for (int iw = 0; iw < wielkosc; iw++)
				System.out.print(znak);
			System.out.println("");
		}
	}

}

package zadania;

import java.util.Scanner;

public class z2 {

	public static void main(String[] args) {
		int a, b,   wynik = 0 , wynik1 = 0 , wynik2= 0 , wynik3= 0  ; 
		
		int n = 0; 
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Podaj dwie liczby całkowite. Pierwsza ma być mniejsza od drugiej. Liczba 1: "); 
	a = sc.nextInt() ; 
	
	do {
		System.out.println("Podaj drugą liczbę, pamiętaj, że ma być większa od pierwszej. Liczba 2: ");
		b = sc.nextInt(); 
		if (a < b == true)
			break; 
		else 
			System.out.println("Podana liczba nie jest większa od liczby 1. Podaj liczbę jeszcze raz!");
	}while (a < b != true); 
	
	for (int i = 0 ; a+i <b+1 ; i++) {
		wynik += a+i; 
	}
	
	System.out.println("Wynik ciągu twoich liczb to: " + wynik);

	
	
	do { 
		
		wynik1+= a + n;
		n++;
	}while (a+n <=b);
	
	System.out.println("Wynik do while: " + wynik1);
	
	n= 0; 
	while (a + n <= b ) {
		
		wynik2 += a+n; 
		n++; 
	}
	System.out.println("Wynik while: " + wynik2);

	
	for (n =0; a + n <= b; n++ ) {
		wynik3 += a +n ; 
	}
	System.out.println("Wynik for: " + wynik3);

}
}

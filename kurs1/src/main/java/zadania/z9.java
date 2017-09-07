package zadania;

import java.util.Scanner;

public class z9 {
/*
 * Napisać program, który sprawdza, czy podana liczba całkowita n, n > 1, jest
liczbą pierwszą.
 */
	
	public static void main(String[] args) {
		int x, z=0; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Program sprawdza czy podana liczba jest liczbą piewszą");
		x= sc.nextInt(); 
		
		
		for (int i = 1 ; i <=x ; i++) {
			if ( x%i == 0)
				z+=1 ; 
		}
		
		if (x == 2 || x ==1 || z<=2 ) {
			System.out.println(x + " to liczba pierwsza");			
		}
	
	
		else 
			System.out.println(x + " nie jest liczbą pierwszą!");
			
			
	}
}

package zadania;

import java.util.Scanner;

public class z1 {

	public static void main(String[] args) {
		int a ;
		int n = 1 ; 
		
		System.out.println("Podaj liczbę całkowitą: ");
		Scanner sc = new Scanner(System.in) ; 
		a =sc.nextInt();
		do {
			if(n%2 != 0)
				System.out.println(n);
			n++;
		}while (n<=a); 
		
	}
}

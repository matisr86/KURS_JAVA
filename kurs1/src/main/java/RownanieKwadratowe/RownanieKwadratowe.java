package RownanieKwadratowe;

public class RownanieKwadratowe {

	private int a , b , c ;
	


public RownanieKwadratowe (int a, int b, int c) {
	this.a= a; 
	this.b= b; 
	this.c= c; 
}

public String rozwiaz() {
	String rozwiazanie = "";
	double delta = b * b - 4 * a * c;
	if (delta > 0) {
		delta = Math.sqrt(delta) ;
		double x1 = (- b - delta)/(2*a) ; 
		double x2 = (-b + delta) / (2 * a) ; 
		rozwiazanie = "Równanie posaida dwa pierwiastki rzeczywiste: " + x1 + " oraz "  + x2 ; 
	}
	else if (delta ==0) {
		delta= Math.sqrt(delta);
		double x0=-b/(2*a);
		rozwiazanie = "Równanie posiada jeden pierwiastek rzeczywisty" + x0 ; 
	}
	else {
		rozwiazanie = "Brak pierwiastków rzeczywistych" ;

	}
	return rozwiazanie;
}

public String toString () {
	return "Równanie kwadratowe: " + a + "x^2 + " + b + "x +" + c ; 
}

public void setA(int a){
	this.a = a ;
	}
public void setB(int b){
	this.b = b ;
}

public void setC(int c) {
	this.c = c ;
}

public static void main (String [] args){
	RownanieKwadratowe rownanie = new RownanieKwadratowe (1 , 4, 1) ; 
	System.out.println(rownanie.rozwiaz());
}
}
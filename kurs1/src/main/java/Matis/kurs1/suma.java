package Matis.kurs1;

public class suma {

public int suma (int arg0, int...args) {
	int wynik = arg0;
	for (int i=0; i<args.length; i++) {
		wynik+=args[i] ;
	}
	return wynik; 
}

public void wypisz(int arg0, int...args) {
	System.out.println("Pieerwszy argument sytały: " + arg0);
	for (int i=0; i <args.length; i++){
		System.out.println(i+ 1 + " argument zmienny: " +args[i]);
	}
}
}

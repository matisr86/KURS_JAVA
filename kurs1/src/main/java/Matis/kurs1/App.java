package Matis.kurs1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Cześć Mateusz!" );
        
        suma suma = new suma() ;
        System.out.println(suma.suma(2));
        System.out.println(suma.suma(2,2,2));
        System.out.println(suma.suma(2,3,4,5,6));
        
        suma.wypisz(1,  3, 6, 77, 888);
    }
}

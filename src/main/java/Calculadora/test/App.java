package Calculadora.test;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    System.out.println("pruebas unitarias ejemplo");
    
    int numero1=3;
    int numero2=5;
    suma(numero1,numero2);
   
    }
    

    public static void suma(int a,int b) {
    	int suma = a+b;
    	System.out.println("la suma es "+suma);
    }
    
    
    
}

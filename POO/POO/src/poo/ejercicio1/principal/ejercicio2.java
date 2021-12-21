
package poo.ejercicio1.principal;

import java.util.Scanner;
import poo.ejercicio1.entidades.Circunferencia;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Indique elRadio de la Circunferncia:");
        
        Circunferencia circunferencia= new Circunferencia(leer.nextDouble());
        
        System.out.println("El Area es: " + circunferencia.area());
        
        System.out.println("El Perimetro es: " + circunferencia.perimetro());
    }
    
}

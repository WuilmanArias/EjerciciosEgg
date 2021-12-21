
package poo.ejercicio4.principal;

import java.util.Scanner;
import poo.ejercicio4.entidades.Rectangulo;

public class ejercicio4 {

    public static void main(String[] args) {
        double base = 0, altura = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Indique la base del Rectangulo: ");
        base = leer.nextDouble();
        System.out.println("Indique la altura del Rectangulo: ");
        altura = leer.nextDouble();
        
        Rectangulo rectangulo= new Rectangulo(base,altura);
        
        System.out.println(rectangulo.toString());
        
       System.out.println("La superficie es: " + rectangulo.superficie());
       System.out.println("El perimetro es: " + rectangulo.perimetro());
       rectangulo.dibujarRectangulo();
        
        
    }
    
}

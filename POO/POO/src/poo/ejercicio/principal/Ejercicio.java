
package poo.ejercicio.principal;

import java.util.Scanner;
import poo.ejercicio.entidades.Persona;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona persona = new Persona(40,180,"Wuilman","95817901");
        Persona persona1 = new Persona();
        
        System.out.println(persona);
        
    }
    
    
    
}

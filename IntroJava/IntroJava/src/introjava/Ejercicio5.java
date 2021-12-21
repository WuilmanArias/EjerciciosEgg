/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package introjava;

import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los Graos Centigrados");
        double grados = leer.nextDouble();
        System.out.println("Su equivalente en Fahrenheit es: " + (32 + (9*grados/5)));
        
    }
    
}

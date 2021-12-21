/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java
*/
package introjava;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        System.out.println("La fase en Mayusculas: " + frase.toUpperCase());
        System.out.println("La fase en Mayusculas: " + frase.toLowerCase());
    }
    
}

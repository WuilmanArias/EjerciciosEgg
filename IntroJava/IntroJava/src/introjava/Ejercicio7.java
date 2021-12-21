/*
 Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla
 */
package introjava;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba dos numero: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        System.out.println("El mayor de los dos es: " + Math.max(num2, num1));
        
    }
    
}

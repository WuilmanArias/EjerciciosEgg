/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt(
 */
package introjava;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba un numero: ");
        int num = leer.nextInt();
        
        System.out.println("EL doble del numero es:" + num*2);
        System.out.println("EL triple del numero es:" + num*3);
        System.out.println("La Raiz cuadrada del numero es:" + Math.sqrt(num));
        
    }
    
}

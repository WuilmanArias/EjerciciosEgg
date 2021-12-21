
import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma/
package introjava;
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Igrese dos valores: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma es: " + (num1+num2));
        
    }
    
}
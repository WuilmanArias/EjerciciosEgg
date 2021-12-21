/*
 Crear un programa que dado un numero determine si es par o impar
 */
package introjava;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba un numero: ");
        int num = leer.nextInt();
        
        System.out.println(num%2);
        
        if ((num%2)==0) {
        System.out.println("El numero es PAR");
    }else{
    System.out.println("El numero es IMPAR");
}
    }
}
    
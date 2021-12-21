/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta
 */
package introjava;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        int nota = leer.nextInt();

        if (nota < 0 || nota > 10) {
            do {
                System.out.println("Ingrese una nota correcta");
                nota = leer.nextInt();

            } while ((nota < 0 || nota > 10));
        }
        System.out.println("LA NOTA ES CORRECTA");
    }

}

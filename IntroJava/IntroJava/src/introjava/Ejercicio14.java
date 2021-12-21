/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. 
 */
package introjava;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor positivo");
        int limite = leer.nextInt();
        int num = 0, acum = 0;
        
        

        if (acum <= limite) {
            do {
                System.out.println("Ingrese un valor");
                num = leer.nextInt();
                acum = acum + num;
            } while (acum <= limite);

        }
        System.out.println(acum);
        System.out.println("Ha superado el limete inicial");
    }

}

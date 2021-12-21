//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
package introjava;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese 4 numeros");
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("  *");
            }
            System.out.println(" ");
        }
    }

}

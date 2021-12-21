/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * * 
*       *
*       *
*       *
* * * * *

 */
package introjava;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique los lados del cuadrado");
        int num = leer.nextInt();
        int cont = 0;

        do {
            if (cont == 0 || cont == num - 1) {
                for (int i = 0; i < num; i++) {
                    System.out.print("* ");
                }
                cont++;
                System.out.println("");
            }

            if (cont != num) {
                for (int i = 0; i < num; i++) {
                    if (i == 0 || i == num - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                cont++;
                System.out.println("");
            }

        } while (cont < num);

    }

}

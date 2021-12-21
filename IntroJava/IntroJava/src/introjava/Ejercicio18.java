/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package introjava;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String x1, x2, x3;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if (i == 3) {
                        x1 = "E";
                    } else {
                        x1 = String.valueOf(i);
                    }

                    if (j == 3) {
                        x2 = "E";
                    } else {
                        x2 = String.valueOf(j);
                    }

                    if (k == 3) {
                        x3 = "E";
                    } else {
                        x3 = String.valueOf(k);
                    }

                    System.out.println(x1 + "-" + x2 + "-" + x3);

                }
            }
        }
    }

}

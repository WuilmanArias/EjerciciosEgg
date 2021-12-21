/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
 */
package introjava;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        int cont = 0, post = 0;
        int[] vector = new int[num];
        
        vector= llenar(num);// Llamar a la funcion para llenar el vector

        System.out.println("Ingrese un numero a buscar");
        num = leer.nextInt();

        // Buscar el numero
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == num) {
                cont++;
                if (cont == 1) {
                    post = i;
                }
            }
            System.out.print(vector[i]+"-");
        }

        if (cont > 0) {
            System.out.println("");
            System.out.println("El numero se encuentra en la posicion: " + post + " Y aparece " + cont + " Veces");
        }else{
            System.out.println("");
            System.out.println("Lo siento no aparece");
        }
    }

    public static int[] llenar(int num) {
        // Llear el vector con numeros aleatorios
        int[] vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
           
        }
        return vector;
    }

}

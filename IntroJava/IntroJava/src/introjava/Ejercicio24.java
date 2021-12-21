/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package introjava;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        String a;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, post = 0;
        int[] vector = new int[num];

        vector = llenar(num);// Llamar a la funcion para llenar el vector

        for (int i = 0; i < vector.length; i++) {
            a = Integer.toString(vector[i]);
            //System.out.println(a+"-" + a.length() + " ");

            switch (a.length()) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;

            }

        }
        System.out.println(" Hay " + cont1+ " De un digito ");
        System.out.println(" Hay " + cont2+ " De dos digito ");
        System.out.println(" Hay " + cont3+ " De tres digito ");
        System.out.println(" Hay " + cont4+ " De cuatro digito ");
        System.out.println(" Hay " + cont5+ " De cinco digito ");
    }

    public static int[] llenar(int num) {
        // Llear el vector con numeros aleatorios
        int[] vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 90000);

        }
        return vector;
    }
}

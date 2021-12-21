/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package poo.ejercicio10.principal;

import java.util.Arrays;

/**
 *
 * @author ana
 */
public class ejercicio10 {

    public static void main(String[] args) {
        int[] arreA=new int[50];
        int[] arreB=new int[20];
        
        for (int i = 0; i < arreA.length; i++) {
            arreA[i]=(int) (Math.random()*20);
        }
        mostarArreglo(arreA);
        
        System.out.println("");
        Arrays.sort(arreA);
        mostarArreglo(arreA);
        
        System.out.println("");
        arreB= Arrays.copyOf(arreA, 20);
        mostarArreglo(arreB);
        
        Arrays.fill(arreB, 10, 20, 99);
        System.out.println("");
        mostarArreglo(arreB);
    }
    
    public static void mostarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
            
        }
    }
    
}

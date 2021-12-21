package introjava;
/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
 */


import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Igresa tu nombre: ");
        String nombre = leer.next();
        System.out.println("Bienvenido: " + nombre);
        
    }
    
}

package poo.ejercicio1.principal;

import java.util.Scanner;
import poo.ejercicio1.entidades.Libro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Libro libro=new Libro();
                
        System.out.println("Ingrese ISBN: ");
        libro.setIsbn(leer.nextInt());
        System.out.println("Ingrese El Titulo: ");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese El Autor: ");
        libro.setAutor(leer.next());
        System.out.println("Ingrese elnumero de paginas: ");
        libro.setNumeroPagina(leer.nextInt());
       
        System.out.println(libro);
    }
    
}

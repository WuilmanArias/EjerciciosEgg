
package poo.ejercicioE1.servicios;

import java.util.Scanner;
import poo.ejercicioE1.entidades.Cancion;

public class CancionServicio {
    
    public Cancion crearCancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo: ");
        String titulo=leer.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor=leer.nextLine();
        Cancion cancion =  new Cancion(titulo, autor);
        return cancion;
    }
}

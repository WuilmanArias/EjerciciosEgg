package colecciones.ejercicio4.principal;

import colecciones.ejercicio4.entidades.Pelicula;
import colecciones.ejercicio4.servicios.PeliculaServicios;
import colecciones.ejercicio4.utilidades.Comparadores;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicios peliculaServicios = new PeliculaServicios();
        String resp = "";
        Pelicula pelicula;
        do {
            pelicula = peliculaServicios.crearPelicula();

            peliculaServicios.cargarPelicula(pelicula);
            System.out.println("Desea ingresar otra pelicula (S/N):");
            resp = leer.next();
        } while (resp.toUpperCase().equals("S"));

        System.out.println("********** PELICULAS CREADAS ************");
        peliculaServicios.mostrarPelicula(pelicula);

        System.out.println("");
        System.out.println("****** PELICULAS CON MAS DE 1 HORA************");
        peliculaServicios.mostrarPeliculaUnaHora(pelicula);
        
        System.out.println("");
        System.out.println("****** PELICULAS ORDENADAS POR HORA DE MMAYOR A MENOR************");
        peliculaServicios.ordenarPeliculamayormenor(pelicula);
        peliculaServicios.mostrarPelicula(pelicula);
        
        System.out.println("");
        System.out.println("****** PELICULAS ORDENADAS TITULO************");
        peliculaServicios.ordenarAlfabeticoTitulo(pelicula);
        peliculaServicios.mostrarPelicula(pelicula);
        
        System.out.println("");
        System.out.println("****** PELICULAS ORDENADAS DIRECTOR************");
        peliculaServicios.ordenarAlfabeticoDirector(pelicula);
        peliculaServicios.mostrarPelicula(pelicula);
        
        
    }

}

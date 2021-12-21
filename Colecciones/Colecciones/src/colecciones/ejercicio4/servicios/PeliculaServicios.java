/*
Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */
package colecciones.ejercicio4.servicios;
import java.util.Collections;
import colecciones.ejercicio4.entidades.Pelicula;
import colecciones.ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PeliculaServicios {
    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
        peliculas = new ArrayList();
    }

  public Pelicula crearPelicula(){
      Pelicula pelicula=new Pelicula();
      
      System.out.println("Ingrese el titulo");
      String titulo = leer.next();
      System.out.println("Ingrese el director");
      String director = leer.next();
      System.out.println("Ingrese horas de duracion");
      Integer horas = leer.nextInt();
      
      pelicula.setTitulo(titulo);
      pelicula.setDirector(director);
      pelicula.setHora(horas);
      
      return pelicula;
  }  
  
  public void cargarPelicula(Pelicula pelicula){
      peliculas.add(pelicula);
  }
  
  public void mostrarPelicula(Pelicula pelicula){
      for (Pelicula peli : peliculas) {
          System.out.println(peli);
      }
  }
  
  public void mostrarPeliculaUnaHora(Pelicula pelicula){
      for (Pelicula peli : peliculas) {
          if (peli.getHora()>1) {
              System.out.println(peli);
              
          }
      }
  }
  
  public void ordenarPeliculamayormenor(Pelicula pelicula){
            Collections.sort(peliculas, Comparadores.ordenarDuracionMayorMenor);
      }
  
   public void ordenarAlfabeticoTitulo(Pelicula pelicula){
            Collections.sort(peliculas, Comparadores.ordenarTitulo);
      }
   
    public void ordenarAlfabeticoDirector(Pelicula pelicula){
            Collections.sort(peliculas, Comparadores.ordenarDirector);
      }
  }


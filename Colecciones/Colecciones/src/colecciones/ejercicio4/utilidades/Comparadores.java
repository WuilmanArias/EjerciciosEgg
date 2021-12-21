/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio4.utilidades;

import colecciones.ejercicio4.entidades.Pelicula;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pelicula> ordenarDuracionMayorMenor=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getHora().compareTo(t.getHora());
                    
        }
    }; 
    
    public static Comparator<Pelicula> ordenarDuracionMenorMayor=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getHora().compareTo(t1.getHora());
                    
        }
    }; 
    
    public static Comparator<Pelicula> ordenarTitulo=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
              return t1.getTitulo().compareTo(t.getTitulo());
        }
    }; 
    
    public static Comparator<Pelicula> ordenarDirector=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
              return t1.getDirector().compareTo(t.getDirector());
        }
    }; 
    
}


package poo.ejercicioE2.principal;

import poo.ejercicioE2.entidades.Puntos;
import poo.ejercicioE2.servicios.PuntosServicio;

public class ejercicioE2 {

    public static void main(String[] args) {
        PuntosServicio puntosServicio = new PuntosServicio();
        Puntos puntos=puntosServicio.crearPuntos();
        
        System.out.println(puntos);
        
        double a=puntosServicio.distancia(puntos);
        System.out.println("*************************");
        System.out.println("La Distancia es: "+a);
        
        double raiz=Math.sqrt(17);
        System.out.println(raiz);
    }
    
}

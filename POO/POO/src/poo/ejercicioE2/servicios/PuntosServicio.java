/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioE2.servicios;

import java.util.Scanner;
import poo.ejercicioE2.entidades.Puntos;

public class PuntosServicio {
    
    public Puntos crearPuntos(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro coordinadas: ");
        int x1=leer.nextInt();
        int y1=leer.nextInt();
        int x2=leer.nextInt();
        int y2=leer.nextInt();
        Puntos puntos =  new Puntos(x1, y1, x2, y2);
        return puntos;
    }
    
    public double distancia(Puntos puntos){
        double distancia=0;
        
       // System.out.println(puntos.getX2()-puntos.getX1());
       // System.out.println(puntos.getY2()-puntos.getY1());
        
        distancia= Math.sqrt(Math.pow(puntos.getX2()-puntos.getX1(),2)+ Math.pow(puntos.getY2()-puntos.getY1(),2));
        
        
        return distancia;
    }
    
}

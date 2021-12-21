/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioE1.principal;

import poo.ejercicioE1.servicios.CancionServicio;
import poo.ejercicioE1.entidades.Cancion;

/**
 *
 * @author ana
 */
public class ejercicioE1 {

    public static void main(String[] args) {
        CancionServicio cancionServicio = new CancionServicio();
        Cancion cancion=cancionServicio.crearCancion();
        
        System.out.println(cancion.toString());
    }   
    
}

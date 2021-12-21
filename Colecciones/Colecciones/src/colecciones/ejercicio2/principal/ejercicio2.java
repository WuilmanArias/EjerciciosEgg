/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio2.principal;

import colecciones.ejercicio2.servicios.ServicioRazas;

public class ejercicio2 {

    public static void main(String[] args) {
        ServicioRazas serRaza = new ServicioRazas();
       
        serRaza.crearRaza();
        serRaza.mostrarRaza();
        serRaza.buscarPerro();
        serRaza.mostrarRaza();
    }
    
}

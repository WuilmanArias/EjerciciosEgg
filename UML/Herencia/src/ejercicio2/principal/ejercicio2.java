/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.principal;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;

/**
 *
 * @author ana
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        lavadora.crearLavadora();
      
            
        System.out.println(lavadora.toString()); 
        System.out.println("******************************");
        System.out.println(televisor.toString()); 
         
    }

}

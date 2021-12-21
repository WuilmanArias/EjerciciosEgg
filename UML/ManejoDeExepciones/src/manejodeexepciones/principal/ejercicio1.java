/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexepciones.principal;

import manejodeexepciones.entidades.Persona1;
import manejodeexepciones.entidades.PersonaServicio;

public class ejercicio1 {

    public static void main(String[] args) {
        Persona1 persona = new Persona1();
        PersonaServicio PerSer = new PersonaServicio();
        persona = null;
        
        try {
            PerSer.esMayorDeEdad(persona);

        } catch (Exception e) {
           // e.printStackTrace();
            e.getStackTrace();
            System.out.println("La persona es nulla "+e.fillInStackTrace());
        }
    }

}

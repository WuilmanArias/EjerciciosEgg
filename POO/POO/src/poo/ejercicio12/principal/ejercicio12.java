/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio12.principal;

import java.util.Date;
import java.util.Scanner;
import poo.ejercicio12.entidades.Persona2;
import poo.ejercicio12.servicios.PersonaServicio;

/**
 *
 * @author ana
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        PersonaServicio personaServicio = new PersonaServicio();
        Persona2 persona2=personaServicio.crearPersona();
        personaServicio.calcularEdad(persona2);
        System.out.println("Ingrese una fecha: ");
        int dia=leer.nextInt();
        int mes=leer.nextInt();
        int anio=leer.nextInt();
        
        Date nuevaFecha= new Date(anio - 1900, mes, dia);
        
        personaServicio.menorQue(persona2,nuevaFecha);
        
        System.out.println(persona2.toString());
    }
    
}

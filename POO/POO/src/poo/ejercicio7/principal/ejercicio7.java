/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio7.principal;

import poo.ejercicio.entidades.Persona;
import poo.ejercicio7.entidades.Persona1;
import poo.ejercicio7.servicios.PersonaServicio;

public class ejercicio7 {

    public static void main(String[] args) {
        float contI = 0, contPD = 0, contS = 0, ContMay = 0, contMen = 0;
        float imc = 0;
        boolean esMayorDeEdad;

        PersonaServicio personaServicio = new PersonaServicio();
        Persona1[] persona = new Persona1[3];

        for (int i = 0; i < persona.length; i++) {
            persona[i] = personaServicio.crearPersona();
        }

        for (int i = 0; i < persona.length; i++) {
            imc = personaServicio.calcularIMC(persona[i]);
            esMayorDeEdad = personaServicio.esMayorDeEdad(persona[i]);

            if (imc == -1) {
                contPD++;
                System.out.print("Estas por debajo de su peso ideal ");

            } else if (imc == 0) {
                contI++;
                System.out.print("Estas en tu peso ideal ");
            } else if (imc == 1) {
                contS++;
                System.out.print("Tienes Sobrepeso ");
            }

            if (esMayorDeEdad == true) {
                ContMay++;
                System.out.println("- Eres mayor de edad");
            } else {
                contMen++;
                System.out.println("- Eres menor de edad");
            }
        }

        //personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima
        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println("Hay "+contPD+ " Estas por debajo de su peso ideal ");
        System.out.println("Hay "+ contI+ " Estas en tu peso ideal ");
        System.out.println("Hay "+contS+ " Con Sobrepeso");
        
        //calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println("Hay "+ ((ContMay/(ContMay+contMen))*100)+ "% de Mayores" );
        System.out.println("Hay "+ ((contMen/(ContMay+contMen))*100)+ "% de Menores" );
        
        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i].toString());
        }
    }

}

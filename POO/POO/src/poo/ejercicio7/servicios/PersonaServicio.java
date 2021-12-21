package poo.ejercicio7.servicios;

import java.util.Scanner;
import poo.ejercicio7.entidades.Persona1;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona1 crearPersona() {

        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();

        System.out.println("Sexo 'H' hombre, 'M' mujer, 'O' otro): ");
        String sexo;
        boolean bandera = false;
        do {
            sexo = leer.next();
            if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {

                bandera = true;

            } else {
                bandera = false;
                System.out.println("Debe Ingresar una Opcion Valida");
            }

        } while (bandera == false);

        System.out.println("Ingrese el Peso: ");
        float peso = leer.nextFloat();
        System.out.println("Ingrese la altura: ");
        float altura = leer.nextFloat();

        Persona1 persona = new Persona1(nombre, edad, sexo, peso, altura);

        return persona;
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
     */
    public float calcularIMC(Persona1 persona) {
        float imc = 0;
        //(peso en kg/(altura^2 en mt2))
        imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        
        if (imc < 20) {
            imc = -1;
        }
        if (imc >= 20 && imc <= 25) {
            imc = 0;
        }
        if (imc >= 25) {
            imc = 1;
        }

        return imc;
    }

    public boolean esMayorDeEdad(Persona1 persona) {
        boolean esMayorDeEdad;
        if (persona.getEdad()>=18) {
            esMayorDeEdad=true;
        }else{
            esMayorDeEdad=false;
        }
        return esMayorDeEdad;
    }

}

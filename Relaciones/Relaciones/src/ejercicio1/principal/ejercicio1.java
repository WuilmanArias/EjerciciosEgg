/*

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio1.principal;

import ejercicio1.relaciones.entidades.Perro;
import ejercicio1.relaciones.entidades.Persona;

public class ejercicio1 {

    public static void main(String[] args) {
        Perro perro1 = new Perro("LUNA", "Callejera", 1, "Pequeña");
        Perro perro2 = new Perro("ZASHA", "Pastor Aleman", 3, "Grande");
        
        Persona persona1=new Persona("Wuilman", "Arias", 51, "95817999", perro2);
        Persona persona2=new Persona("Luis", "Leal", 60, "10504506", perro1);
        Persona persona3=new Persona("Miriam", "De Leal", 58, "25124925", perro1);
        
        System.out.println("****Persona UNO*****");
        System.out.println(persona1.getNombre()+" "+persona1.getApellido()+" tiene un perro que se llama "+ persona1.getPerro().getNombre());
        System.out.println("Su perro es de raza "+ persona1.getPerro().getRaza());
        System.out.println("***********************************");
        System.out.println(persona2);
    }
    
}

/*
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
21
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
package poo.ejercicio12.servicios;

import java.util.Date;
import java.util.Scanner;
import poo.ejercicio.entidades.Persona;
import poo.ejercicio12.entidades.Persona2;

/**
 *
 * @author ana
 */
public class PersonaServicio {
    
    public Persona2   crearPersona(){
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre=leer.nextLine();
        Persona2 persona2 = new Persona2(nombre);
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();

        Date fNac = new Date(); // Creamos el objeto tipo Date

        fNac.setDate(dia); // Seteamos el dia
        fNac.setMonth(mes-1); // Seteamos el mes
        fNac.setYear(anio-1900); // Seteamos el anio

        persona2.llenarFecha(fNac);
        
        return persona2;
    }
    
    public void calcularEdad(Persona2 persona2){
        Date actual = new Date();
        
        int anos = actual.getYear()-(persona2.getfNac().getYear());
        System.out.println("Tienes "+ anos + " años.");
        
    }
    
    /*recibe como parámetro
    otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.*/
    public void menorQue(Persona2 persona2, Date nuevaFecha){
        if (persona2.getfNac().before(nuevaFecha)) {
            System.out.println("La fecha es mayor que la de: "+ persona2.getNombre());
        }else{
            System.out.println("La fecha es menor que la de: "+ persona2.getNombre());
        }
        
    }
    
    
    
}

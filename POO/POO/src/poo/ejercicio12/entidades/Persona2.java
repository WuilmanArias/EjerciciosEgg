/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
 */
package poo.ejercicio12.entidades;

import java.util.Date;

public class Persona2 {
    private String Nombre;
    private Date fNac;

    public Persona2() {
        fNac= new Date(); // Esto es para que no se cree la fecha en null 
    }

    public Persona2(String Nombre, Date fNac) {
        this.Nombre = Nombre;
        this.fNac = fNac;
    }

    public Persona2(String Nombre) {
        this.Nombre = Nombre;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }
    
    public void llenarFecha(Date fNac) {

        this.fNac = fNac; // Lo guardamos en el atributo

    }

    @Override
    public String toString() {
        return "Persona2{" + "Nombre=" + Nombre + ", fNac=" + fNac + '}';
    }
    
    
    
}

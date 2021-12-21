/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
    
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo.ejercicio11.principal;

import java.util.Calendar;
import java.util.Date;

public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dia=10,mes=9,anio=70;
       
       Date fecha = new Date(anio,mes, dia);
        Date fechaActual = new Date();
        
        
        System.out.println("************FECHA DE HOY *******************");
        System.out.println(fechaActual.toString());
        System.out.println(fechaActual.getHours());
        System.out.println("");
        
        System.out.println("************FECHA DEL USUARIO*******************");
        System.out.println(fecha.toString());
        System.out.println("");
        
        System.out.println("************CANTIDAD DE AÑOS ENTRE DOS FECHAS*******************");
        System.out.println("Entre el año "+(fecha.getYear()+1900) + " y el año Actual hay: "+ ((fechaActual.getYear())-anio));
        System.out.println("");
        
        System.out.println(fechaActual.getYear());
        System.out.println(1900+121);
    }
    
}

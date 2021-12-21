/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio3.principal;

import colecciones.ejercicio3.entidades.Alumno;
import colecciones.ejercicio3.servicios.ServicioAlumno;
import java.util.Scanner;

public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno serviAlumno = new ServicioAlumno();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";
        float promedio = 0;
        Alumno alumno;
        do {
            alumno = serviAlumno.crearAlumno();
            serviAlumno.agregarAlumno(alumno);

            System.out.println("Desea ingresar otro alumno (S/N)");
            resp = leer.next();

        } while (resp.toUpperCase().equals("S"));

        System.out.println("Ingrese el nombre del alumno a promediar las notas");
        resp = leer.next();
        promedio = serviAlumno.sacarPromedio(resp);
        if (promedio==0) {
            System.out.println("Lo siento el alumno no esta registrado");
        }else{
            
        System.out.println("El promedio del alumno: " + resp + " es: " + promedio);
        System.out.println(" ");
        }
        
        serviAlumno.mostrarAlumno(alumno);

    }

}

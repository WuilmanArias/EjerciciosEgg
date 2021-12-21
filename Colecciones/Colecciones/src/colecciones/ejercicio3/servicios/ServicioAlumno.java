/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio3.servicios;

import colecciones.ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {
    
    private Scanner leer;
    private ArrayList<Alumno> alumnos;

    public ServicioAlumno() {
        leer = new Scanner(System.in).useDelimiter("\n");
        alumnos = new ArrayList(); // Cada vez que se llame el servicio nace el ArrayList
    }
    
     public Alumno crearAlumno() {
            //ArrayList<Integer> notas= new ArrayList();
            Alumno alum=new Alumno();
            
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            alum.setNombre(nombre);
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota "+(i+1));
                int nota=leer.nextInt();
                alum.getNotas().add(nota);
         }
            
            /*System.out.println("Ingrese la Nota 1");
            int nota1 = leer.nextInt();
            System.out.println("Ingrese la Nota 2");
            int nota2 = leer.nextInt();
            System.out.println("Ingrese la Nota 3");
            int nota3 = leer.nextInt();
                       
            alumno.getNotas().add(nota1);
            alumno.getNotas().add(nota2);
            alumno.getNotas().add(nota3);*/
            

            
        return alum;
    }
     
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    } 
    
    public void mostrarAlumno(Alumno alumno) {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }

    }
    
    public float sacarPromedio(String nombre){
        float acum=0;
        float cont=0;
        
        //Este for recorre todo el array de Alumnos
        for (Alumno alu : alumnos) {
            if (alu.getNombre().equals(nombre)) {
                //Este for recorre todo el array pasado como atributo a Alumnos
                for (Integer nota : alu.getNotas()) {
                    acum+=nota;
                    cont++;
                }
                
            }else{
                return 0;
            }
        }
        return acum/cont;
    }
            
}

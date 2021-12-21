/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.

 */

package colecciones.ejercicio2.servicios;
import colecciones.ejercicio2.entidades.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioRazas {

    private Scanner leer;
    private ArrayList<String> razas;

    public ServicioRazas() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList(); // Cada vez que se llame el servicio nace el ArrayList
    }

    public void crearRaza() {
        String siNo;
        do {
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese la Raza");
            String raza = leer.next();
            String auxRaza = nombre + " " + raza;
            razas.add(auxRaza);
            System.out.println("Desea ingresar otro canino");
            siNo = leer.next();
            
        } while (siNo.equals("S"));

    }

    public void mostrarRaza() {

        System.out.println("Las razas son");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad: " + razas.size());
    }
    
    public void borrarRaza() {

        System.out.println("Las razas son");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad: " + razas.size());
    }
    
    public void buscarPerro(){
        //ArrayList <String> razaBorrar = new ArrayList();
        System.out.println("Ingrese el Perro a borrar");
        String perro=leer.next();
         System.out.println("*****"+perro+"******");
        //razas.add(perro);
        Iterator<String> it=razas.iterator();
        
        
        while (it.hasNext()) {
            String next = it.next();            
            if (next.equals(perro)) {
                it.remove();
            }
            
        }
        
        
        
        /*for (int i = 0; i < razas.size(); i++) {
            if (!razas.equals(perro)) {
                System.out.println("Verdadero");
                razas.remove(i);
                i=razas.size()+1;
            }else{
                System.out.println("No esta la Raza");
               
            }
        }*/
    }
}

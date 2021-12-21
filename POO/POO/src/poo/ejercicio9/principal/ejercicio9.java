
package poo.ejercicio9.principal;

import poo.ejercicio8.servicios.MatematicaServicio;
import poo.ejercicio9.entidades.Matematica;

public class ejercicio9 {

    public static void main(String[] args) {
        //int numeroAzar = (int) (Math.random() * 10);
        
        MatematicaServicio matematicaServicio= new MatematicaServicio();
        Matematica matematica = matematicaServicio.cargar();
        
   // ************Saber cualde los dos es el mayor*************************
        double mayor=matematicaServicio.devolverMayor(matematica);
        System.out.println("El mayor es: "+mayor+"\n");
        
        
   // ************Calcular la potencia *************************
        double potencia=matematicaServicio.calcularPotencia(matematica);
        System.out.println("La potencia es: "+potencia+"\n");
        
   // ************Calcular la Raiz Cuadrada*************************
        double raiz=matematicaServicio.calculaRaiz(matematica);
        System.out.println("La raiz es: "+raiz+"\n");
        
        
        
        System.out.println(matematica.toString());
        
    }
    
}

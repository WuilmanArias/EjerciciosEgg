/*
 En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. 
 */
package poo.ejercicio8.principal;

import java.util.Scanner;
import poo.ejercicio8.entidades.Cadena;
import poo.ejercicio8.servicios.CadenaServicio;

/**
 *
 * @author ana
 */
public class ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CadenaServicio cadenaServicio = new CadenaServicio();
        Cadena cadena = cadenaServicio.cargar();
        
        //public void mostrarVocales(Cadena frase)*******************
        System.out.println("**************************** ");
        cadenaServicio.mostrarVocales(cadena);
        
        
        //public void invertirFrase(Cadena frase)***************
        //StringBuilder sb=new StringBuilder(cadena1);
        //System.out.println(sb.reverse());

        System.out.println("");
        System.out.println("**************************** ");
        System.out.println("La frase invertida");
        cadenaServicio.invertirFrase(cadena);
        
        
        //public void vecesRepetido(Cadena frase, char letra) *******************+
        System.out.println("");
        System.out.println("************************** ");
        System.out.println("Ingrese la letra a buscar: ");
        char letra = leer.next().toLowerCase().charAt(0);
        System.out.println("");
        cadenaServicio.vecesRepetido(cadena, letra);
        System.out.println(" " + "\n");

        
        //public void compararLongitud(Cadena cadena, String frase)*****************
        System.out.println("");
        System.out.println("********************");
        System.out.println("Ingresa una frase: ");
        String frase = leer.next();
        cadenaServicio.compararLongitud(cadena, frase);

        
        //public void unirFrases(Cadena cadena, String frase)
         System.out.println("");
        System.out.println("************************** ");
        System.out.println("Ingresa una frase: ");
        frase = leer.next();
        cadenaServicio.unirFrases(cadena, frase);
        
        
        //public String reemplazar(Cadena cadena, char letra)********************+
        System.out.println("");
        System.out.println("************************** ");
        System.out.println("Ingrese la letra de reemplazo: ");
        String caracter = leer.next();
        System.out.println("");
        cadenaServicio.reemplazar(cadena, caracter);
        System.out.println(" " + "\n");
        
        
        
        ///public boolean contiene
        System.out.println("");
        System.out.println("************************** ");
        System.out.println("Ingrese la secuencia de letra(s) a buscar: ");
        String pro = leer.next();
        System.out.println("");
        boolean contiene= cadenaServicio.contiene(cadena, pro);
        if (contiene) {
            System.out.println("Lo contiene"); 
        }else{
            System.out.println("NO Lo contiene"); 
        }
        System.out.println(" " + "\n");
        
        
        System.out.println("");
        System.out.println("********************");
        System.out.println(cadena);

    }

}

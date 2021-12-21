/*
 = frase.length(); = frase.length();
 */
package poo.ejercicio8.servicios;

import java.util.Arrays;
import java.util.Scanner;
import poo.ejercicio8.entidades.Cadena;

/**
 *
 * @author ana
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public Cadena cargar() {
        System.out.println("Ingrese una Cadena de caracteres: ");
        String frase = leer.nextLine();
        Integer longitud = frase.length();

        Cadena cadena = new Cadena();
        cadena.setFrase(frase);
        cadena.setLongitud(longitud);
        return cadena;
    }

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena frase) {
        int cantVocal = 0;
        String f = frase.getFrase();
        String[] vector = new String[f.length()];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = f.toLowerCase().substring(i, i + 1);

            if ("a".equals(vector[i]) || "e".equals(vector[i]) || "i".equals(vector[i]) || "o".equals(vector[i]) || "u".equals(vector[i])) {
                cantVocal++;
            }

        }

        System.out.println(" ");
        System.out.println("Cantidad de vocles: " + cantVocal);
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
    por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"*/
    public void invertirFrase(Cadena frase) {
        String oracion = frase.getFrase();
        char letra;

        for (int i = oracion.length() - 1; i >= 0; i--) {
            letra = oracion.charAt(i);
            System.out.print(letra + "");
        }

    }

    /*
    Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
    ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
    frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(Cadena frase, char letra) {
        String oracion = frase.getFrase();

        int veces = 0;
        for (int i = 0; i < oracion.length(); i++) {

            if (oracion.toLowerCase().charAt(i) == letra) {
                veces++;
            }

        }
        System.out.println("La letra " + letra + " Esta " + veces + " Veces");

    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase
    que compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(Cadena cadena, String frase) {

        if (cadena.getFrase().length() == frase.length()) {
            System.out.println("Las frases son de igual longitud");
        } else {
            System.out.println("Las frases NO son de igual longitud");
        }
    }

    /*
       Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante
     */
    public void unirFrases(Cadena cadena, String frase) {
        System.out.println("");
        System.out.println("*********Cadenas Concatenadas************");
        System.out.println(cadena.getFrase().concat(frase));
        
    }
    
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    mostrar la frase resultante.
     */
    public void reemplazar(Cadena cadena, String letra) {
        //return cadena.getFrase().replace("a", frase4);
        String f = cadena.getFrase();
        
        String[] vector = new String[f.length()];
        
        for (int i = 0; i < f.length(); i++) {
            vector[i]=f.toLowerCase().substring(i, i + 1);
        }
        for (int i = 0; i < f.length(); i++) {
            if ("a".equals(vector[i])) {
                vector[i]=letra;
            }

        }
        System.out.println(Arrays.toString(vector));
        
        
    }
    
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    public boolean contiene(Cadena cadena,String letra){
        
        if (cadena.getFrase().contains(letra)) {
            return true;
        }else{
            return false;
        }
    }
    
}
 
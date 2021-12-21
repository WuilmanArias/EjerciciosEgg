/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta.
*/
package ejercicio1.principal;

import ejercicio1.entidades.Animal;
import ejercicio1.entidades.Caballo;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Perro;

public class ejercicio1 {

    public static void main(String[] args) {
        // -Declaracioon del objeto Perro
        Animal perro=new Perro("Simba", "DogShao", 2, "Puder");
        perro.Alimentarce();
        Animal perro1=new Perro("Zasha", "Pro Plan", 5, "Pastor Aleman");
        perro1.Alimentarce();
        
        // -Declaracioon del objeto Gato
        Animal gato=new Gato("Tierno", "CatShao", 1, "Angora");
        gato.Alimentarce();
        
        // -Declaracioon del objeto Gato
        Animal caballo=new Caballo("Toro", "Pasto", 3, "Cuarto de Milla");
        caballo.Alimentarce();
    }
    
}


package ejercicio3.principal;

import ejercicio3.relaciones.entidades.Baraja;
import ejercicio3.relaciones.entidades.Cara;
import ejercicio3.relaciones.entidades.Mazo;
import ejercicio3.relaciones.entidades.Palo;

public class ejercicio3A {

    public static void main(String[] args) {
        
        Mazo mazo = new Mazo();
        
        for (Palo aux : Palo.values()) {
                
            for (Cara aux1 : Cara.values()) {
                Baraja baraja = new Baraja(aux, aux1);
                baraja.setCara(aux1);
                baraja.setPalo(aux);
                mazo.llenarMazo(baraja);
            }
        }
        mazo.mostrarMazo();
        System.out.println("");
        mazo.barajar();
        System.out.println("");
        mazo.mostrarMazo();
        
        System.out.println("*************************");
        mazo.siguienteCarta();
        
        System.out.println("*************************");
        mazo.siguienteCarta();
        
        System.out.println("*************************");
        mazo.cartasDisponibles();
    }
    
}

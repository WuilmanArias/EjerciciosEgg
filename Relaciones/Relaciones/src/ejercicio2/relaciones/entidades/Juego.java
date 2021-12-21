/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package ejercicio2.relaciones.entidades;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador>jugadores;
    private Revolver revolver;
    

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public Juego() {
        this.jugadores = new ArrayList();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    
    
    public void llenarJuego(Jugador jugador, Revolver r){
        
            jugadores.add(jugador);
        
    }
    
    public void ronda(Revolver revolver){
        
        boolean mojar=false;
        String nombre="";
         do {
        for (Jugador aux : jugadores) {
            mojar = revolver.mojar(revolver);
            if (mojar) {
                System.out.println("Disparo");
                nombre=aux.getNombre();
                break;
            } else {
                System.out.println(revolver);
                revolver.siguienteChorro(revolver);
            }
            
                }
        } while (mojar==false);
        
        System.out.println("El jugador perdedor fue " + nombre);
    }
    
    
    
    
}

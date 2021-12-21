/*
barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
package ejercicio3.relaciones.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Mazo {

    private ArrayList<Baraja> mazo;

    public Mazo() {
        this.mazo = new ArrayList();
    }

    public ArrayList<Baraja> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Baraja> mazo) {
        this.mazo = mazo;
    }

    //Este metodo llena el ArrayList
    public void llenarMazo(Baraja baraja) {
        mazo.add(baraja);
    }

//barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(mazo);
    }

    public void mostrarMazo() {
        int cont = 0;
        System.out.println(mazo.size());

        for (Baraja aux : mazo) {
            cont++;
            System.out.print(aux.getCara() + " de " + aux.getPalo());
            System.out.print(" ");
            if (cont == 10) {
                System.out.println(" ");
                cont = 0;
            }
        }
    }

    /*
    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
    haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
     */
    
    public void siguienteCarta(){
        if (mazo==null) {
            System.out.println("Ya no hay mas barajas");
        }else{
            System.out.println(mazo.get(0).getCara() + " de " + mazo.get(0).getPalo());
            mazo.remove(0);
        }
    }
    
    /*    
    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    */
    public void cartasDisponibles(){
        System.out.println(mazo.size());
    } 
    
    /*
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
    número de cartas. En caso de que haya menos cartas que las pedidas, no
    devolveremos nada, pero debemos indicárselo al usuario.
    */
    
    @Override
    public String toString() {
        return "Mazo{" + "mazo=" + mazo + '}';
    }

}

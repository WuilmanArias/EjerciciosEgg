/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.relaciones.entidades;

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class Baraja {
    private Cara cara;
    private Palo palo;

    public Baraja(Palo palo, Cara cara) {
        this.cara = cara;
        this.palo = palo;
    }

    public Baraja() {
    }

    public Cara getCara() {
        return cara;
    }

    public void setCara(Cara cara) {
        this.cara = cara;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

   

    @Override
    public String toString() {
        return "Baraja{" + "cara=" + cara + ", palo=" + palo + '}';
    }

    
    
    

    
    
}


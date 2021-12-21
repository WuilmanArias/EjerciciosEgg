/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioE4.entidades;

/**
 *int 
 * @author ana
 */
public class NIF {
    private int numDni;
    private String letra;

    public NIF(int numDni, String letra) {
        this.numDni = numDni;
        this.letra = letra;
    }
    public NIF() {
        
    }
    

    public int getNumDni() {
        return numDni;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" + "numDni=" + numDni + ", letra=" + letra + '}';
    }
    
    
    
}

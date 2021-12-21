/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud
 */
package poo.ejercicio8.entidades;

/**
 *
 * @author ana
 */
public class Cadena {

    private String frase;
    private Integer longitud;

    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

}

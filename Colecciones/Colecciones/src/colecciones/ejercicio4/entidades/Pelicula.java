/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide
 */
package colecciones.ejercicio4.entidades;

import java.util.Date;

/**
 *
 * @author ana
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer hora;

    public Pelicula(String titulo, String director, int hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", hora=" + hora + '}';
    }
    
    
}

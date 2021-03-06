/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.persistence.annotations.CollectionTable;

/**
 *
 * @author ana
 */
@Entity
public class Mascota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String nombre;
    
    @Column(name="colo_de_pelo", length = 400)
    private String colorDePelo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    public Mascota(String id, String nombre, String colorDePelo, Date fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.colorDePelo = colorDePelo;
        this.fechaAlta = fechaAlta;
    }

    public Mascota() {
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", colorDePelo=" + colorDePelo + ", fechaAlta=" + fechaAlta + '}';
    }
    
    
    
    }

   
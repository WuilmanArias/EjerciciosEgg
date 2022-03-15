package com.libreria.servicios;

import com.libreria.entidades.Autor;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.AutorRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {

    @Autowired //Al marcar este atributo como autowire le decimos al servidor de aplicaciones la inicialice el.
    AutorRepositorio autorRepositorio;

    public void crear(String nombre) throws ErrorServicio {
        validar(nombre);

        Autor autor = new Autor();

        autor.setNombre(nombre);
        autor.setAlta(true);

        autorRepositorio.save(autor);

    }

    public void modificar(String id, String nombre) throws ErrorServicio {

        validar(nombre);

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }else{
            throw new ErrorServicio("El librono existe");
        }

    }
    
    public void bajaAutor(String id) throws ErrorServicio {

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setAlta(false);
            autorRepositorio.save(autor);
        }else{
            throw new ErrorServicio("El librono existe");
        }

    }
    
     public void altaAutor(String id) throws ErrorServicio {

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setAlta(true);
            autorRepositorio.save(autor);
        }else{
            throw new ErrorServicio("El librono existe");
        }

    }

    public void validar(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre no puede estar vacio");
        }

    }

}

package com.libreria.servicios;

import com.libreria.entidades.Editorial;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.EditorialRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServivio {

    @Autowired
    EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crear(String nombre) throws ErrorServicio {
        validar(nombre);

        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);
        editorial.setAlta(true);

        editorialRepositorio.save(editorial);
    }
    
    @Transactional
    public void modificar(String id, String nombre) throws ErrorServicio {
        validar(nombre);

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Editorial editorial = new Editorial();

            editorial.setNombre(nombre);
            editorial.setAlta(true);

            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("La Editorial no existe");
        }
    }

    @Transactional
    public void bajaEditorial(String id) throws ErrorServicio {

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Editorial editorial = new Editorial();

            editorial.setAlta(false);

            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("La Editorial no existe");
        }
    }

    @Transactional
    public void altaEditorial(String id) throws ErrorServicio {

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Editorial editorial = new Editorial();

            editorial.setAlta(true);

            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("La Editorial no existe");
        }
    }

    
    public void validar(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre no puede estar vacio");
        }
    }

}

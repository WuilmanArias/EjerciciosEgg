package com.libreria.servicios;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.AutorRepositorio;
import com.libreria.repositorios.EditorialRepositorio;
import com.libreria.repositorios.LibroRepositorio;
import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // esta clase es un servicio Spring
public class LibroServicio {

    @Autowired //Al marcar este atributo como autowire le decimos al servidor de aplicaciones la inicialice el.
    private LibroRepositorio libroRepositorio;
    
    @Transactional
    public void crear(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados,
            Autor autor, Editorial editorial, Date fecAlta) throws ErrorServicio {
        
        validar(isbn, titulo, anio, ejemplares, ejemplaresPrestados,
            autor, editorial);

        
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setRestantes(ejemplares - ejemplaresPrestados);
        libro.setAlta(true);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setFecAlta(new Date());

        libroRepositorio.save(libro);
    }
    
    @Transactional
    public void modificar(String id,Long isbn, String titulo, Integer anio, Integer ejemplares, 
            Integer ejemplaresPrestados, Autor autor, Editorial editorial) throws ErrorServicio{
        
        validar(isbn, titulo, anio, ejemplares, ejemplaresPrestados,
            autor, editorial);
        
        Optional<Libro> respuesta=libroRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Libro libro= respuesta.get();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplares(ejemplaresPrestados);
            libro.setRestantes(ejemplares - libro.getEjemplaresPrestados());
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            
            libroRepositorio.save(libro);
            
        }else{
            throw new ErrorServicio("El libro No existe");
        }
        
        
    }
    
    @Transactional
     public void bajaLibro(String id) throws ErrorServicio{
        
        Optional<Libro> respuesta=libroRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Libro libro= respuesta.get();
            
            libro.setAlta(false);
            
            libroRepositorio.save(libro);
            
        }else{
            throw new ErrorServicio("El libro No existe");
        }
        
        
    }
     
     @Transactional
     public void AltaLibro(String id) throws ErrorServicio{
        
        Optional<Libro> respuesta=libroRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Libro libro= respuesta.get();
            
            libro.setAlta(true);
            
            libroRepositorio.save(libro);
            
        }else{
            throw new ErrorServicio("El libro No existe");
        }
        
        
    }
    
    private void validar(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados,
            Autor autor, Editorial editorial)throws ErrorServicio{
        
        if (isbn == null || isbn <= 0) {
            throw new ErrorServicio("El ISBN no puede estar vacio o ser igual a 0");
        }

        if (titulo == null || titulo.isEmpty()) {
            throw new ErrorServicio("El nombre del titulo no puede estar vacio");
        }

        if (anio == null || anio <= 0) {
            throw new ErrorServicio("El ISBN no puede estar vacio o ser igual a 0");
        }
        if (ejemplares == null || ejemplares <= 0) {
            throw new ErrorServicio("La cantidad de ejemplares no puede estar vacio o ser igual a 0");
        }
        if (ejemplaresPrestados == null) {
            throw new ErrorServicio("La cantidad de ejemplares prestados no puede estar vacio");
        }
        
        if (autor==null) {
            throw new ErrorServicio("El autor no puede estar vacio");
        }
        
        if (editorial==null) {
            throw new ErrorServicio("La editorial no puede estar vacio");
        }
    }

}

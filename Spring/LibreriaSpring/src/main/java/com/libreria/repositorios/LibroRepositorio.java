
package com.libreria.repositorios;

import com.libreria.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String>{
    
    @Query("SELECT m FROM Libro m WHERE m.id LIKE :id")
    public List<Libro> listarPorId(@Param("id") String id);
    
    
    @Query("SELECT m FROM Libro m WHERE m.titulo LIKE :titulo")
    public List<Libro> listarPorTitulo(@Param("%titulo%") String titulo);
}

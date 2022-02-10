
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

public class LibroDAO extends DAO{
    
    public void guardar (Libro objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Libro modificar (Libro objeto){
        conectar();
        em.getTransaction().begin();
        Libro u= em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }
    
    public void eliminar (Libro objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Libro buscarPorId(String id){
        return em.find(Libro.class, id);
    }
    
    public List<Libro> listarTodos(){
        List <Libro> libros= em.createQuery("SELECT u FROM Libro u").getResultList();
        return libros;
    }
    
    public List<Libro> listarPorTitulo(String titulo) {
        return em.createQuery("SELECT m FROM Libro m WHERE m.titulo LIKE :titulo")
                .setParameter("titulo", "%" + titulo + "%")
                .getResultList();
    }
    
    public List<Libro> listarPorNombreDeAutor(String nombre) {
        return em.createQuery("SELECT l FROM Libro l, Autor a WHERE l.autor.nombre :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
    }
    
}


package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO{
    
    public void guardar (Autor objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Autor modificar (Autor objeto){
        conectar();
        em.getTransaction().begin();
        Autor u= em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }
    
    public void eliminar (Autor objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Autor buscarPorId(String id){
        return em.find(Autor.class, id);
    }
    
    public List<Autor> listarPorNombre(String nombre) {
        return em.createQuery("SELECT m FROM Autor m WHERE m.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
    }
    
    public List<Autor> listarTodos(){
        conectar();
        List <Autor> usuarios= em.createQuery("SELECT u FROM Autor u").getResultList();
         
        return usuarios;
    }
}

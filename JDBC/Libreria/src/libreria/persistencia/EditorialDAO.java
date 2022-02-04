package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO {

    public void guardar(Editorial objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public Editorial modificar(Editorial objeto) {
        conectar();
        em.getTransaction().begin();
        Editorial u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }

    public void eliminar(Editorial objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public Editorial buscarPorId(String id) {
        return em.find(Editorial.class, id);
    }

    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT u FROM Editorial u").getResultList();
        return editoriales;
    }
}

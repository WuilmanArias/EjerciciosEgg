package libreria.sevicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private final AutorDAO autorDAO;

    public AutorServicio() {
        autorDAO = new AutorDAO();
    }

    public void crear(String nombre) {

        Autor autor = new Autor(nombre, true);

        autorDAO.guardar(autor);

    }

    public void modificar(String id, String nombre, Boolean alta) {

        Autor autor = autorDAO.buscarPorId(id);
        autor.setNombre(nombre);
        autor.setAlta(alta);

        autorDAO.modificar(autor);

    }

    public void eliminar(String id) {

        Autor autor = autorDAO.buscarPorId(id);
        autorDAO.eliminar(autor);

    }
    
    public List<Autor> listarPorNombre(String nombre) throws Exception {
        if (autorDAO.listarPorNombre(nombre)==null) {
            
        }
        return autorDAO.listarPorNombre(nombre);
    }

    public Autor buscarPorId(String id) {
        return autorDAO.buscarPorId(id);
    }

    public List<Autor> listarTodos() {
        List<Autor> usuarios = autorDAO.listarTodos();
        return usuarios;
    }

}

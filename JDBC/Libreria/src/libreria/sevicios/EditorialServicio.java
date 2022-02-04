package libreria.sevicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private final EditorialDAO editorialDao;

    public EditorialServicio() {
        editorialDao = new EditorialDAO();
    }

    public void crear(String nombre) {

        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorial.setAlta(true);

        editorialDao.guardar(editorial);

    }

    public void modificar(String id, String nombre, Boolean alta) {

        Editorial editorial = editorialDao.buscarPorId(id);
        editorial.setNombre(nombre);
        editorial.setAlta(alta);

        editorialDao.guardar(editorial);

    }

    public void eliminar(String id) {

        Editorial editorial = editorialDao.buscarPorId(id);
        editorialDao.eliminar(editorial);

    }

    public Editorial buscarPorId(String id) {
        return editorialDao.buscarPorId(id);
    }

    public List<Editorial> listarTodos() {
        List<Editorial> editoriales = editorialDao.listarTodos();
        return editoriales;
    }
}

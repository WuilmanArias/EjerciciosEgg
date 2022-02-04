package libreria.sevicios;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private final LibroDAO libroDAO;
    private Autor autor;
    private Editorial editorial;

    public LibroServicio() {
        libroDAO = new LibroDAO();
        autor = new Autor();
        editorial = new Editorial();
    }

    public void crear(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados,
            Integer ejemplaresRestantes, Boolean alta, String autorAux, String editorialAux) {
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(alta);
        try {
            AutorDAO autDao = new AutorDAO();
            EditorialDAO ediDao = new EditorialDAO();

            if ((autDao.buscarPorId(autorAux) != null) || (ediDao.buscarPorId(editorialAux) != null)) {
                autor = autDao.buscarPorId(autorAux);
                editorial= ediDao.buscarPorId(editorialAux);
                libro.setAutor(autor);
                libro.setEditorial(editorial);
            }

        } catch (Exception e) {
            throw e;
        }

        libroDAO.guardar(libro);

    }

}

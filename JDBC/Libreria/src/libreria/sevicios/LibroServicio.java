package libreria.sevicios;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private final LibroDAO libroDAO;
    private final Autor autor;
    private final Editorial editorial;

    public LibroServicio() {
        libroDAO = new LibroDAO();
        autor = new Autor();
        editorial = new Editorial();
    }

    public void crear(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados,
            Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial)  {
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(alta);
        try {
            AutorDAO aut=new AutorDAO();
            EditorialDAO edi=new EditorialDAO();
            if ((aut.buscarPorId(autor.getId())!= null) ||(edi.buscarPorId(editorial.getId())!= null)) {
                libro.setAutor(autor);
                libro.setEditorial(editorial);
            }

        } catch (Exception e) {
            throw e;
        }
        

        libroDAO.guardar(libro);

    }

}

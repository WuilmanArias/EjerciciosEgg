package libreria.sevicios;

import java.util.List;
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
            Integer ejemplaresRestantes, Boolean alta, String autorAux, String editorialAux) throws Exception {
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(alta);

        AutorDAO autDao = new AutorDAO();
        EditorialDAO ediDao = new EditorialDAO();

        if ((autDao.buscarPorId(autorAux) == null) || (ediDao.buscarPorId(editorialAux) == null)) {

            throw new Exception("El autor o Editorial no existe");

        } else {

            autor = autDao.buscarPorId(autorAux);
            editorial = ediDao.buscarPorId(editorialAux);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
        }

        libroDAO.guardar(libro);

    }

    public void modificar(String ibsn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados,
            Integer ejemplaresRestantes, Boolean alta, String autorAux, String editorialAux) throws Exception {
        if (libroDAO.buscarPorId(ibsn) != null) {
            Libro libro = libroDAO.buscarPorId(ibsn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(alta);
            AutorDAO autDao = new AutorDAO();
            EditorialDAO ediDao = new EditorialDAO();
            autor=autDao.buscarPorId(autorAux);
            editorial= ediDao.buscarPorId(editorialAux);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
        } else {
            throw new Exception("El libro no existe");
        }
    }

    public void eliminar(String isbn) throws Exception {

        if (libroDAO.buscarPorId(isbn) != null) {
            Libro libro = libroDAO.buscarPorId(isbn);
            libroDAO.eliminar(libro);
        } else {
            throw new Exception("El libro no existe");
        }
    }

    public Libro buscarPorIsbn(String isbn) throws Exception {
        if (libroDAO.buscarPorId(isbn)==null) {
            throw new Exception("El libro no existe");
        }
            return libroDAO.buscarPorId(isbn);
        
    }
    
    public void listarPorTitulo(String titulo) {
        List<Libro> libros=libroDAO.listarPorTitulo(titulo);
        //Libro{id=551, titulo=El Principito, anio=2, ejemplares=1, ejemplaresPrestados=0, ejemplaresRestantes=1, 
        //alta=true, autor=Autor{id=101, nombre=Luis Leal, alta=true}, 
        //editorial=Editoreal{id=401, nombre=Santa Monica, alta=true}}
        for (Libro aux : libros) {
            System.out.println("************************************************");
            System.out.println("ISBN: " + aux.getId());
            System.out.println("Titulo: " + aux.getTitulo());
            System.out.println("Año: " + aux.getAnio());
            System.out.println("Ejemplares: " + aux.getEjemplares());
            System.out.println("Ejemplares Prestados: " + aux.getEjemplaresPrestados() );
            System.out.println("Ejemplares Restantes: " + aux.getEjemplaresRestantes());
            System.out.println("Autor: " + aux.getAutor().getNombre());
            System.out.println("Editorial: " + aux.getEditorial().getNombre());
            System.out.println("************************************************");
            System.out.println(" ");
        }
        
    }
    
    public void listarPorNombreDeAutor(String nombre){
        List<Libro> libros=libroDAO.listarPorNombreDeAutor(nombre);
        
        for (Libro aux : libros) {
            System.out.println(aux);
        }
    }
    
    private void validarUsuarioNull(Libro u) throws Exception {
        if (u == null) {
            throw new Exception("No existe ese usuario");
        }
    }

}

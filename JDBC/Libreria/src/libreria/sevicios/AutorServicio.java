package libreria.sevicios;

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

}

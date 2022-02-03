package libreria;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;
import libreria.sevicios.AutorServicio;

public class Libreria {

    public static void main(String[] args) {

        AutorServicio autorServicio = new AutorServicio();
        //Autor autor = new Autor("Pedro Perez", true);
        autorServicio.crear("Andre Alejandro Arias");
   
        
    }

}

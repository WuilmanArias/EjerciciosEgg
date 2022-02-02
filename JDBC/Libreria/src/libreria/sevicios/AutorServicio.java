
package libreria.sevicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {
    
    private final AutorDAO autorDAO;
    
    public AutorServicio(){
        autorDAO=new AutorDAO();
    }
    
    public void crear(String nombre, Boolean alta ){
        
        Autor autor = new Autor();
        autor.setNombre(nombre);  
        autor.setAlta(Boolean.TRUE);
        
        autorDAO.guardar(autor);
        
    }
    
}

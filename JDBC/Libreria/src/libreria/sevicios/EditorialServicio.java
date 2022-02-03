
package libreria.sevicios;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {
    private final EditorialDAO editorialDao;
    
    public EditorialServicio(){
        editorialDao=new EditorialDAO();
    }
    
    public void crear(String nombre, Boolean alta ){
        
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);  
        editorial.setAlta(Boolean.TRUE);
        
        editorialDao.guardar(editorial);
        
    }
}

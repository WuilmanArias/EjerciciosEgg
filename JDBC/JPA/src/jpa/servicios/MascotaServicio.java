package jpa.servicios;

import java.util.Date;
import jpa.entidades.Mascota;
import jpa.persistencia.MascotaDAO;

public class MascotaServicio {
    
    private final MascotaDAO mascotaDao;
    
    public MascotaServicio(){
        mascotaDao = new MascotaDAO();
    }
    
    public void crear(String nombre, String colorDePelo ){
        
        Mascota m = new Mascota();
        m.setNombre(nombre); 
        m.setColorDePelo(colorDePelo);
        m.setFechaAlta(new Date());
        
        mascotaDao.guardar(m);
        
    }
    
}

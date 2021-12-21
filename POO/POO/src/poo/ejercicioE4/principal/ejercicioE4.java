
package poo.ejercicioE4.principal;

import poo.ejercicioE4.servicios.NIFServicio;
import poo.ejercicioE4.entidades.NIF;

public class ejercicioE4 {

    public static void main(String[] args) {
        NIFServicio nifServicio=new NIFServicio();
        NIF nif=nifServicio.crearNif();
        
        System.out.println(nif.getNumDni()+"-"+nif.getLetra());
    }
    
}


package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {
    private FabricanteDAO fabricanteDao;

    public FabricanteServicio() {
        fabricanteDao = new FabricanteDAO();
    }
    
     public Fabricante buscarFabricantePorcodigo(Integer codigo) throws Exception {
         if (codigo==null || codigo<1) {
             throw new Exception("Indique un codigo valido");
         }
         
         Fabricante f = fabricanteDao.buscarFabricantePorcodigo(codigo);
         return f;
     }
    
}

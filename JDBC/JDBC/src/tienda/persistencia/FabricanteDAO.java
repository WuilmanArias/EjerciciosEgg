
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author ana
 */
public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception("Debe Indicar un fabricante");
            }
            // "INSERT INTO fabricante VALUES("+ fabricante.getCodigo() +", '"+ usuario.getNombre() +"');"
            String sql = "INSERT INTO fabricante VALUES(" + fabricante.getCodigo() + ", '" + fabricante.getNombre() + "');";
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception("Debe Indicar un fabricante");
            }

            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo= '" + fabricante.getCodigo() + "';";
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(Integer codigo) throws Exception {

        try {

            String sql = "DELETE FROM fabricante WHERE codigo='" + codigo + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {

        try {
            //Select * from fabricante where nombre = 'caro@yahoo.com';
            String sql = "SELECT * FROM fabricante WHERE nombre= '" + nombre + "';";
            ConsultarBase(sql);
            Fabricante fabricante = null;

            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Fabricante buscarFabricantePorcodigo(Integer codigo) throws Exception {

        try {
            //Select * from fabricante where nombre = 'caro@yahoo.com';
            String sql = "SELECT * FROM fabricante WHERE codigo= '" + codigo + "';";
            ConsultarBase(sql);
            Fabricante fabricante = null;

            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }

            return fabricante;

        } catch (Exception e) {

            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {

            String sql = "SELECT * FROM fabricante ";
            ConsultarBase(sql);
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

}

package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collector;
import principal.dominio.usuario.Usuario;


public final class UsuarioDAO extends DAO {

    public void guardarUsuario(Usuario usuario) throws Exception {

        try {
            if (usuario == null) {
                throw new Exception("Debe Indicar un usuario");
            }
        // INSERT INTO usuario VALUES ('789', 'Teresa', 'tere@gmail.com','16');
            String sql = "INSERT INTO usuario VALUES ('" + usuario.getClave() +"','"+ usuario.getNombre() +"','"+ usuario.getCorreoElectronico() + "','" + usuario.getEdad() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {

        try {
            if (usuario == null) {
                throw new Exception("Debe Indicar un usuario");
            }

            String sql = "UPDATE usuario SET"
                    + "clave = '" + usuario.getClave() + "'WHERE CorreoElectroico= '" + usuario.getCorreoElectronico() + "' );";
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarUsuario(String correoElectronico) throws Exception {

        try {

            String sql = "DELETE FROM usuario WHERE correoElectronico='" + correoElectronico + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {

        try {
            //Select * from usuario where correoElectronico = 'caro@yahoo.com';
            String sql = "SELECT * FROM usuario WHERE correoElectronico= '" + correoElectronico + "'";
            ConsultarBase(sql);
            Usuario usuario = null;

            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setClave(resultado.getString(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setCorreoElectronico(resultado.getString(3));
                usuario.setEdad(resultado.getInt(4));
            }
            desconectarBase();
            return usuario;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Usuario> listarUsuarios() throws Exception {

        try {

            String sql = "SELECT correoElecctronico, clave FROM usuario ";
            ConsultarBase(sql);
            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList();
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

}

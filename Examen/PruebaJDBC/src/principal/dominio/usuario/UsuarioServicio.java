// los servicios validan datos y manejan lalogica delnegocio
// Siempre Main al => servicio


package principal.dominio.usuario;
import principal.persistencia.UsuarioDAO;

public class UsuarioServicio {
    private UsuarioDAO dao;

    public UsuarioServicio() {
        this.dao = new UsuarioDAO();
    }
    
       
    public void crearUsuario(String clave, String nombre, String correoElectronico, int edad) throws Exception{
        
        try {
            //Validamos
            if (correoElectronico==null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electronico");
            }
            if (correoElectronico.contains("@")==false) {
                throw new Exception("El correo electronico es incorrecto");
            }
            if (clave==null || clave.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electronico");
            }
            if (clave.length()<8) {
                throw new Exception("La clave no puede contener menos de 8 caracteres");
            }
            if (dao.buscarUsuarioPorCorreoElectronico(correoElectronico)!=null) {
                throw new Exception("Ya el correo electronico existe");
            }
            
            //Creamos el usuario
            Usuario usuario= new Usuario();
            usuario.setClave(clave);
            usuario.setNombre(nombre);
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setEdad(edad);
            dao.guardarUsuario(usuario);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}

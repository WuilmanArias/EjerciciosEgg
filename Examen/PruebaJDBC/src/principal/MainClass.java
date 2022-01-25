
// Envio Main => Servicio => Entidad DAO => DAO =>
// Retorno DAO => Entidad DAO => Entidad Crear la entidad (Clase) => Servicio => Main

package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import principal.dominio.usuario.UsuarioServicio;

public class MainClass {

    public static void main(String[] args) {
        UsuarioServicio usuarioServicio  = new UsuarioServicio();
        
        try {
            
            usuarioServicio.crearUsuario("12345678", "Wuilman", "wuilman@gmail.com", 51);
        } catch (Exception e) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE,null,e);
            System.out.println(e.getMessage());
        }
    }
    
}

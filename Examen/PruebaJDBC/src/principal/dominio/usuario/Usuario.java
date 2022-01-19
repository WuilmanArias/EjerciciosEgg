
package principal.dominio.usuario;

public class Usuario {
    private String clave;
    private String nombre;
    private String correoElectronico;
    private int edad;

    public Usuario() {
    }

    public Usuario(String clave, String nombre, String correoElectronico, int edad) {
        this.clave = clave;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}

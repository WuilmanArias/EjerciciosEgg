
package poo.ejercicio.entidades;

public class Persona {
    private int edad;
    private int altura;
    private String nombre;
    private String dni;

    public Persona(int edad, int altura, String nombre, String dni) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {
        this.edad = 50;
        this.altura = 190;
        this.nombre = "Andres";
        this.dni = "95810987";
    }
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}

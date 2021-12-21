/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
11
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:

 */
package ejercicio2.entidades;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ana
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnr;
    protected int peso;

    public Electrodomestico(double precio, String color, char consumoEnr, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnr = consumoEnr;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnr() {
        return consumoEnr;
    }

    public void setConsumoEnr(char consumoEnr) {
        this.consumoEnr = consumoEnr;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private boolean comprobarConsumoEnergetico() {
        
        return (consumoEnr >= 'A' && consumoEnr <= 'F');
    }

    private boolean comprobarColor(String color) {
        //blanco, negro, rojo, azul y gris
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")
                || color.equalsIgnoreCase("gris")) {
            return true;
        }
        return false;
    }

    /*
        Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        electrodoméstico, también llama los métodos para comprobar el color y el
        consumo. Al precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        /*String Color = "";
        char consumoEnrC;
        int peso;*/
        

        //double precio, String color, char consumoEnr, int peso
        System.out.println("indique el color del Electrodomestico");
        color = leer.next().toUpperCase();
        System.out.println("indique el consumo energético");
        consumoEnr = leer.next().toUpperCase().charAt(0);
        System.out.println("indique el peso del Electrodomestico");
        peso = leer.nextInt();
        precio=1000;
        
        
        
    }
    
    public double precioFinal(){
        
        if (comprobarColor(color)) {
            color=color;
        } else {
            color="BLANCO";

        }

        if (comprobarConsumoEnergetico()) {
            consumoEnr=consumoEnr;
        } else {
            consumoEnr='F';
        }
        
        double valorFinal=0;
        if (consumoEnr== 'A') {
            valorFinal=1000;
        }
        if (consumoEnr== 'B') {
            valorFinal=800;
        }
        if (consumoEnr== 'C') {
            valorFinal=600;
        }
        if (consumoEnr== 'D') {
            valorFinal=500;
        }
        if (consumoEnr== 'E') {
            valorFinal=300;
        }
        if (consumoEnr== 'F') {
            valorFinal=100;
        }
        
        if (peso>=1 && peso<=19){
            valorFinal=valorFinal+100;
        }
        if (peso>=20 && peso<=49){
            valorFinal=valorFinal+500;
        }
        if (peso>=50 && peso<=79){
            valorFinal=valorFinal+800;
        }
        if (peso>=80){
            valorFinal=valorFinal+1000;
        }
            
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnr=" + consumoEnr + ", peso=" + peso + '}';
    }

}

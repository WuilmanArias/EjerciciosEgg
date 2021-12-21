/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
 */
package ejercicio2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolución;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolución, boolean sintonizadorTDT, double precio, String color, char consumoEnr, int peso) {
        super(precio, color, consumoEnr, peso);
        this.resolución = resolución;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolución() {
        return resolución;
    }

    public void setResolución(int resolución) {
        this.resolución = resolución;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    /* Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.*/
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        double aux = 0;
        String tdt = "";
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        resolución = leer.nextInt();
        System.out.println("Tiene Sintonizador TDT S/N");
        tdt = leer.next();
        sintonizadorTDT = "S".equals(tdt.toUpperCase());

    }

    @Override
    public double precioFinal() {
        double aux = super.precioFinal();
        if (resolución > 40) {
            precio = precio + (precio + aux) * 0.30;
        }
        if (sintonizadorTDT) {
            precio = precio + aux + 500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Televisor {Color: " + getColor() + " Consumo Energetico: " + getConsumoEnr() + " Peso: " + getPeso() + " Pulgadas: " + resolución + " sintonizador TDT: " + sintonizadorTDT + " Precio: " + getPrecio() + '}';
    }
}

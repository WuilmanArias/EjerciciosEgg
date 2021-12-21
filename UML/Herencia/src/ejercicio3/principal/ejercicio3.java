/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.

 */
package ejercicio3.principal;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import java.util.ArrayList;

public class ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomestico = new ArrayList();
        double total=0;
        //    public Lavadora(int carga, double precio, String color, char consumoEnr, int peso) 
        Lavadora lavadora = new Lavadora(1, 1000, "GRIS", 'F', 1);
        Lavadora lavadora1 = new Lavadora(40, 1000, "nara", 'F', 34);

        //public Televisor(int resolución, boolean sintonizadorTDT, double precio, String color, char consumoEnr, int peso)
        Televisor televisor = new Televisor(60, false, 1000, "BLANCO", 'A', 55);
        Televisor televisor1 = new Televisor(60, true, 1000, "to", 'A', 55);

        electrodomestico.add(lavadora);
        electrodomestico.add(lavadora1);
        electrodomestico.add(televisor);
        electrodomestico.add(televisor1);

        for (Electrodomestico aux : electrodomestico) {
            System.out.println(aux);
            aux.precioFinal();
            total+=aux.getPrecio();
        }
            System.out.println("");
            System.out.println("*****************");
        for (Electrodomestico aux : electrodomestico) {
            System.out.println(aux);
        }
        System.out.println("Los electrodomesticos suman: "+total);
    }

}

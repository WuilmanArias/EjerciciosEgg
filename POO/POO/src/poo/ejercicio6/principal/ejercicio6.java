package poo.ejercicio6.principal;

import java.util.Scanner;
import poo.ejercicio6.entidades.Cafetera;
import poo.ejercicio6.servicios.CafeteraServicio;

public class ejercicio6 {

    public static void main(String[] args) {
        CafeteraServicio cafeteraServisio = new CafeteraServicio();
        Cafetera cafetera = cafeteraServisio.llenarCafetera();
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1.- Conectar la Cafetera");
            System.out.println("2.- Servir Cafe");
            System.out.println("3.- Vaciar la Cafetera");
            System.out.println("4.- Surtir la Cafetera");
            System.out.println("5.- Salir");
            System.out.println("Ingrese una opcion");
            opc = leer.nextInt();

            switch (opc) {
                case 1:       
                    System.out.println(cafetera.toString());
                    break;
                case 2:
                    cafeteraServisio.servirTaza(cafetera);
                    System.out.println(cafetera.toString());
                    break;
                case 3:
                    cafeteraServisio.vaciarCafetera(cafetera);
                    System.out.println(cafetera.toString());
                    break;
                case 4:
                    cafeteraServisio.agregarCafe(cafetera);
                    System.out.println(cafetera.toString());
                    break;
                case 5:
                                                
                    break;
                default:
                    System.out.println("El numero ingresado no está en las opcioes");
            }

        } while (opc != 5);

    }

}

package colecciones.ejercicio5.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PaisServicios {

    public static void CrearPais() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> pais = new HashMap();
        String resp = "S";
        boolean logico = true;

        do {
            System.out.println("Ingrese un pais:");
            String nombre = leer.next();
            pais.put(Integer.MAX_VALUE, nombre);
            System.out.println("Desea ingresar otro Pais");
            resp = leer.next();

        } while (resp.toUpperCase().equals("S"));

        for (Map.Entry<Integer, String> aux : pais.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();

            System.out.println("Key: " + key + " Pais: " + value);

        }
    }
}

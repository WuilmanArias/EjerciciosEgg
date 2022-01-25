// Envio Main => Servicio => Entidad DAO => DAO =>
// Retorno DAO => Entidad DAO => Entidad Crear la entidad (Clase) => Servicio => Main
package principal;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class PrincipalMain {

    public static void main(String[] args) {
        int opc = 0;
        Scanner leer=new Scanner(System.in);
        ProductoDAO pDAO = new ProductoDAO();
        do {
            System.out.println("");
            System.out.println("Indique una opcion");
            System.out.println("1.- Listar Todos Los Productos");
            System.out.println("2.- Listar solo los nombre y los precios de todos Los Productos");
            System.out.println("5.- Salir");
            opc=leer.nextInt();
            switch (opc) {
                case 1:

                    try {
                        System.out.println("****Listar Todos Los Productos***********");
                        Collection<Producto> lista = pDAO.listarTodosLosProductos();
                        System.out.printf("%3s%15s%27s%19s%n", "CODIGO","PRODUCTO", "PRECIO", "FABRICANTE" );
                        for (Producto producto : lista) {
                            System.out.printf("%-8s%-35s%-15s%-15s%n",producto.getCodigo(),producto.getNombre(),producto.getPrecio(),producto.getFabricante().getNombre());

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 2:

                    try {
                        System.out.println("");
                        System.out.println("****Listar los nombre y los precios de todos Los Productos***********");
                        Collection<Producto> lista = pDAO.listarNombresPreciosTodosLosProductos();
                        System.out.printf("%18s%12s%n", "Producto", "Precio");
                        for (Producto producto : lista) {
                            System.out.printf("|%-35s|%-15s|%n", producto.getNombre(), producto.getPrecio());

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 3:
                    opc = 5;

            }
        } while (opc != 5);

    }

}


import java.util.ArrayList;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */

/**
 *
 * @author ana
 */
public class ejercicio1 {

    public static void main(String[] args) {
        boolean opc=true;
        String opcion;
        String raza;
        Scanner leer=new Scanner(System.in);
        ArrayList<String> razas=new ArrayList<>();
        System.out.println("Ingrece una raza de perro");
        raza=leer.nextLine();
        razas.add(raza);
        while (opc) {            
            
            System.out.println("Quiere guardar otro perro: (S/N)");
            opcion=leer.next();
            
            if (opcion.equalsIgnoreCase("S")) {
                System.out.println("Ingrece una raza de perro");
            raza=leer.next();
            razas.add(raza);
            }else{
                opc=false;
                System.out.println(razas);
                
            }
        }
        
    }
    
}

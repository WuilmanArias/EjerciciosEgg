/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package introjava;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("1.- Libras");
        System.out.println("2.- Dolar");
        System.out.println("3.- Yenes");
        int opc = leer.nextInt();
        System.out.println("Ingrese la cantidad de Euros");
        float valor = leer.nextFloat();
        
        convercion(valor,opc);
    }
    
    public static void convercion(float valor, int opc) {
         switch (opc){
            case 1:
                System.out.println(valor + " Euros Son " + (valor*0.86) + " Libras");
                break;
            case 2:
                System.out.println(valor + " Euros Son " + (valor*1.28611) + " Dolares");
                break;
            case 3:
                System.out.println(valor + " Euros Son " + (valor*129.852) + " Yenes");
                break;
           
            default:
                System.out.println("Ingrese una opcion valida");
                
            }
    }

   
}


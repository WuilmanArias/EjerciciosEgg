/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 digitos");
        int num=0;
        int sum=0;
        for (int i = 0; i < 20; i++) {
            num = leer.nextInt();
            
            if (num==0) {
                System.out.println("Se capturo el numero cero");
                System.out.println("La suma de los valores es: " + sum);
                break;
            }else if (num>0){
                sum=sum+num;
            }
        }
        if (num!=0) {
            System.out.println("La suma de los valores es: " + sum);
        }
        
        }   
    }

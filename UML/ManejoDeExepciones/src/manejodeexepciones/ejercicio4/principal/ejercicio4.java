/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
package manejodeexepciones.ejercicio4.principal;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio4 {

    public static void main(String[] args) {
        
        try {
            int num=(int) (Math.random()*500);
            juegoAdivina(num);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
    
    public static void juegoAdivina(int num) throws Exception{
        Scanner leer = new Scanner(System.in);
        int numAdivina=0, intentos=0;
        
        
        do {
            System.out.println("Ingrese un numero del 1 al 500");
            numAdivina = leer.nextInt();
            if (numAdivina>num) {
                System.out.println("El numero debe ser menor");
            }else if (numAdivina<num) {
                System.out.println("El numero debe ser Mayor");
            }
            intentos++;
            
        } while (!(num==numAdivina));
        
        
        if (numAdivina>=0 || numAdivina<=0) {
                System.out.println("Adivino el numero en "+ intentos+ " intentos"  );
            
        }else{
            throw new Exception("El caracter no es un numero y realizo " + intentos + " intentos");
        }
    }
}

package poo.ejercicio3.principal;

import java.util.Scanner;
import poo.ejercicio3.entidades.Operacion;

public class ejercicio3 {

    public static void main(String[] args) {
        double numero1 = 0, numero2 = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Indique dos numeros: ");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
        Operacion operacion = new Operacion(numero1, numero2);

        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta " + operacion.restar());
        
        if (operacion.multiplicar()==0) {
            System.out.println("Lo siento no se puede multiplicar por 0");            
        }else{
            System.out.println("Multiplicar: " + (int)operacion.multiplicar());
        }
        
        if (operacion.dividir()==0) {
            System.out.println("Lo siento no se puede puede dividir por 0");            
        }else{
            System.out.println("Dividir: " + (int)operacion.dividir());
        }
        
    }

}

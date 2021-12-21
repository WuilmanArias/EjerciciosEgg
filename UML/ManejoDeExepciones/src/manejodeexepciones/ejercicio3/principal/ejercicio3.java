package manejodeexepciones.ejercicio3.principal;

import java.util.Scanner;


public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        String a = leer.next();
        String b = leer.next();

        try {
            DivisionNumero(a, b);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero 0");
        }catch(NumberFormatException e){
            System.out.println("El valor ingresado no es numero");
        }

    }

    public static void DivisionNumero(String a, String b) throws Exception {
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        if (c >= 0 && d >= 0) {
            System.out.println("La division es: " + c / d);
        } else {
            throw new Exception("Una Exepcion");
        }
        
    }
}

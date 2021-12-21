package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

public class Practica {

//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
    public Boolean numeroCapicua(Integer num) {
        Integer num1 = 0;
        String numero = "";
        String numInv = "";
        if (num == null) {
            return false;
        } else if (numero.length() == 1) {
            return true;
        }

        if (num < 0) {
            num1 = num * -1;
            numero = String.valueOf(num1);
        } else {
            numero = String.valueOf(num);
        }

        for (int i = numero.length() - 1; i >= 0; i--) {
            numInv = numInv + numero.charAt(i);
        }

        if (numero.equals(numInv)) {
            return true;
        }

        return false;
    }

//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int preso = inicio;
        int aux=0;
        aux=cantidadLadrones-1;

        while (cantidadCaramelos > 0) {
            if (cantidadLadrones==1) {
                return 0;
            }

                for (int i = 0; i <= cantidadLadrones-1; i++) {
                    cantidadCaramelos--;
                    preso++;
                    if (preso>cantidadLadrones-1) {
                        preso=0;
                    }
                    if (cantidadCaramelos == 0) {
                        if (preso==0) {
                            return preso=i+1;
                        }
                        return preso-1;
                    }
                }
                    
            }
        return  preso-1;
        }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    

    public List<String> mediasAmigas(List<String> pasajeros) {
        Collections.sort(pasajeros);
        ArrayList<String> medias = new ArrayList();
        
        for (int i = 0; i < pasajeros.size()-1; i++) {
                if (!medias.contains(pasajeros.get(i))) {
            if (pasajeros.get(i).equals(pasajeros.get(i+1))) {
                    
                    medias.add(pasajeros.get(i));
                }
            }
        }
        
        return medias;
    }
}

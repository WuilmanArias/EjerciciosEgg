package poo.ejercicio6.servicios;
import java.util.Scanner;
import poo.ejercicio6.entidades.Cafetera;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    /*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    máxima.*/
    public Cafetera llenarCafetera() {
        Cafetera cafetera = new Cafetera();
        cafetera.setCapacidadMaxima(12);
        cafetera.setCantidadActual(12);
        return cafetera;
    }

    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
    public int servirTaza(Cafetera cafetera) {
        System.out.println("Indique el tamaño de la taza: ");
        int taza = leer.nextInt();

        if (cafetera.getCantidadActual() > 0) {
            if (taza > cafetera.getCantidadActual()) {
                taza = cafetera.getCantidadActual();
                System.out.println("NO se lleno la taza y quedo en: " + taza);
                cafetera.setCantidadActual(0);
                return taza;
            } else {
                System.out.println("La taza se lleno: " + taza);
                cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            }

        } else {
            System.out.println("Lo siento NO hay cafe");
            taza = 0;
            return taza;
        }
        return 0;

    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafetera) {
       cafetera.setCantidadActual(0);
    }

    /*Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada*/
    public Cafetera agregarCafe(Cafetera cafetera) {
        
        System.out.println("Indique la cantidad de cafe");
        int taza = leer.nextInt();
        
        if ((taza+cafetera.getCantidadActual())<=cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + taza);
       
        }else{
            System.out.println("Supera la canntidad maxima");
        }
        
        return cafetera;
    }
}

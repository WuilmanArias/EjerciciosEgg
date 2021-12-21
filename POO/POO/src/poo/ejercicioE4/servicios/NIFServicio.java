package poo.ejercicioE4.servicios;

import java.util.Scanner;
import poo.ejercicioE4.entidades.NIF;

public class NIFServicio {

    public NIF crearNif() {
        Scanner leer = new Scanner(System.in);
        String vector[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        NIF nif=new NIF();
        System.out.println("Ingrece el DNI: ");
        int dni= leer.nextInt();
       
        int resto= dni%23;
        System.out.println("Resto: "+resto);
        String letra=vector[resto];
        
        nif.setNumDni(dni);
        nif.setLetra(letra);
        
        return nif;
    }
    
    
}





package poo.ejercicio5.principal;

import poo.ejercicio5.entidades.Cuenta;
import poo.ejercicio5.servicios.CuentaServicio;

public class ejercicio5 {

    public static void main(String[] args) {
        CuentaServicio cuentaServicio = new CuentaServicio();
        
        Cuenta cuenta = cuentaServicio.crearCuenta();
        System.out.println(cuenta);
        
       // cuentaServicio.ingresarSaldo(cuenta);
       // System.out.println(cuenta);
        
       // cuentaServicio.egresarSaldo(cuenta);
       // System.out.println(cuenta);
        
        cuentaServicio.extraccionRapida(cuenta);
        System.out.println(cuenta);
        
        cuentaServicio.consultarSaldo(cuenta);
        System.out.println(cuenta.getSaldo());
    }
    
}

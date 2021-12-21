package poo.ejercicio5.servicios;

import java.util.Scanner;
import poo.ejercicio5.entidades.Cuenta;

public class CuentaServicio {

    private Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Ingrese la cuenta: ");
        int numeroCueta = leer.nextInt();
        System.out.println("Ingrese el DNI: ");
        Integer dni = leer.nextInt();
        System.out.println("Ingrese el Saldo: ");
        double saldo = leer.nextDouble();

        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCueta(numeroCueta);
        cuenta.setDni(dni);
        cuenta.setSaldo(saldo);

        return cuenta;
    }

    public void ingresarSaldo(Cuenta cuenta) {
        System.out.println("Ingrese el valor del Deposito: ");
        double ingreso = leer.nextDouble();
        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
    }

    public void egresarSaldo(Cuenta cuenta) {
        System.out.println("Ingrese el valor del Retiro: ");
        double egreso = leer.nextDouble();
        if (egreso > cuenta.getSaldo()) {
            cuenta.setSaldo(0);
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - egreso);
        }

    }

    public void extraccionRapida(Cuenta cuenta) {

        if (cuenta.getSaldo() == 0) {
            System.out.println("Saldo Insuficiente");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - (cuenta.getSaldo() * 0.20));
        }
    }
        
        public void consultarSaldo(Cuenta cuenta){
            System.out.println("Susaldo es: " + cuenta.getSaldo());
        }

    
}

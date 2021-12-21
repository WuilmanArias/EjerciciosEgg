/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package poo.ejercicio5.entidades;

public class Cuenta {
    private int numeroCueta;
    private Integer dni;
    private double saldo;

    public Cuenta(int numeroCueta, Integer dni, double saldo) {
        this.numeroCueta = numeroCueta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public int getNumeroCueta() {
        return numeroCueta;
    }

    public void setNumeroCueta(int numeroCueta) {
        this.numeroCueta = numeroCueta;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCueta=" + numeroCueta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }

        
}

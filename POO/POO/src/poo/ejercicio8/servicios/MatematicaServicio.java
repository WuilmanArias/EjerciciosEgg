/*
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package poo.ejercicio8.servicios;

import poo.ejercicio9.entidades.Matematica;

public class MatematicaServicio {
    
     public Matematica cargar(){
        int num1= (int) (Math.random()*10);
        int num2= (int) (Math.random()*10);
        Matematica matematica = new Matematica(num1, num2);
         
        return matematica;
    }  
  
    //Metodo devuelve el mayor de dos numeros**************
     public int devolverMayor(Matematica operacion){
        
        return Math.max(operacion.getNum1(), operacion.getNum2());
    }  
    
    //Calcular la potencia**************
    public double calcularPotencia(Matematica operacion){
        
        return Math.pow(Math.max(operacion.getNum1(), operacion.getNum2()),2);
    }  
    
    //Calcular la potencia**************
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    public double  calculaRaiz(Matematica operacion){
        int menor=Math.min(operacion.getNum1(), operacion.getNum2());
        //Math.sqrt(num2)
        return Math.sqrt(Math.abs(menor));
    }  
}

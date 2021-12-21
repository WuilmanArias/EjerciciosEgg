/*
Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario
*/
package poo.ejercicioE6.entidades;

public class Ahorcado {
    private String[] buscar[];
    private int cantLetra;
    private int cantJugMax;

    public Ahorcado(String[][] buscar, int cantLetra, int cantJugMax) {
        this.buscar = buscar;
        this.cantLetra = cantLetra;
        this.cantJugMax = cantJugMax;
    }
    
    public Ahorcado() {
     
    }

    public String[][] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[][] buscar) {
        this.buscar = buscar;
    }

    public int getCantLetra() {
        return cantLetra;
    }

    public void setCantLetra(int cantLetra) {
        this.cantLetra = cantLetra;
    }

    public int getCantJugMax() {
        return cantJugMax;
    }

    public void setCantJugMax(int cantJugMax) {
        this.cantJugMax = cantJugMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "buscar=" + buscar + ", cantLetra=" + cantLetra + ", cantJugMax=" + cantJugMax + '}';
    }
    
    
    
    
}

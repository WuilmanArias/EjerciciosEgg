
package poo.ejercicioE6.principal;

public class ejercicioE6 {

    public static void main(String[] args) {
       String palabra="Palabra";
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.substring(i,i+1));
        }
               
    }
    
}

/*
public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
random con valor min y max

*/

//  (int) (Math.ramdom()*10)

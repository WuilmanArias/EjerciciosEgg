/*
 . Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
muestre ordenada por sus columnas.
 */
package introjava;

public class Ejercicio255 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int aux = 0, col = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
            }
        }

        //*****MOSTAR LA MATRIZ*************
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println(" ");

        }

        //***ORDENAR MATRIZ*******
        do {

            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (matriz[i][col] > matriz[j][col]) {
                        aux = matriz[i][col];
                        matriz[i][col] = matriz[j][col];
                        matriz[j][col] = aux;
                    }
                }
            }
            col++;
        } while (col < 4);

        System.out.println("");
        System.out.println("");

        //*****MOSTAR LA MATRIZ*************
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println(" ");

        }


        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vector[pos] = matriz[i][j];
                pos++;
            }
        }

        //*****MOSTAR EL VECTOR*************
        
        for (int i = 0; i<4; i++) {
            System.out.print(vector[i]+ "\t");
        }*/
    }

}

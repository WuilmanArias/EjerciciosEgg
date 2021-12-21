/*
 . Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
muestre ordenada por sus columnas.
 */
package introjava;

public class Ejercicio25 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int aux = 0, col = 0;

        matriz = llenar(4);
        mostrar(matriz,4);

    //***********ORDENAR MATRIZ POR COLUMNA****************
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
        mostrar(matriz,4);
    }
    

    //*****FUNCION DE LLENAR LA MATRIZ******************
    public static int[][] llenar(int num) {
        // Llear la matriz con numeros aleatorios
        int[][] matriz = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
            }

        }
        return matriz;
    }

    //****************MOSTRAR MATRIZ*******************
    public static void mostrar(int[][] matriz,int num){
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

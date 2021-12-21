package manejodeexepciones.ejercicio2.principal;

public class ejercicio2 {

    public static void main(String[] args) {

        try {
            Integer[] names = {1, 2, 3};
            for (int i = 0; i <= names.length; i++) {
                System.out.println(names[i]);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getStackTrace());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

}



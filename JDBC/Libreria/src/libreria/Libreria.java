package libreria;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.sevicios.AutorServicio;
import libreria.sevicios.EditorialServicio;
import libreria.sevicios.LibroServicio;

public class Libreria {

    public static void main(String[] args) {
        //       try {
        LibroServicio libroServicio = new LibroServicio();
        libroServicio.crear("Doña Barbara", 3, 3, 1, 2, true, "2", "351");
//        EditorialServicio editorialServicio = new EditorialServicio();
//        Editorial editorial = new Editorial();
//        editorialServicio.crear("Santa Monica");
//        editorialServicio.modificar("351", "Waraira Repano", false);
//            editorialServicio.eliminar("402");
////        autorServicio.crear("Andre Alejandro Arias");
////        autorServicio.listarTodos();
//        autorServicio.modificar("1", "pedro todo", true);
//            editorial=editorialServicio.buscarPorId("351");
//            System.out.println("=============================");
//            System.out.println(editorial);
//            System.out.println("=============================");
            
//            List<Editorial> a = editorialServicio.listarTodos();
//            for (Editorial edi : a) {
//                System.out.println(edi);
//            }
////
//            System.out.println("");
//            System.out.println("*******************");
//            Autor aut = new Autor();
//            aut=autorServicio.buscarPorId("1");
//            System.out.println(aut);
//        } catch (Exception ex) {
//            System.out.println(ex.getLocalizedMessage());
//        }
    }

}

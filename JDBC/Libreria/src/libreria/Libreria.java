package libreria;

//Al alumno le toca desarrollar, las siguientes funcionalidades:
//1) Crear base de datos Librería
//2) Crear unidad de persistencia
//3) Crear entidades previamente mencionadas ( excepto Préstamo )
//4) Generar las tablas con JPA
//5) Crear servicios previamente mencionados.
//6) Crear los métodos para persistir entidades en la base de datos librería
//7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
//8) Búsqueda de un Autor por nombre.
//9) Búsqueda de un libro por ISBN.
//10) Búsqueda de un libro por Título.
//11) Búsqueda de un libro/s por nombre de Autor.
//12) Búsqueda de un libro/s por nombre de Editorial.
//13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
//• Validar campos obligatorios.
//• No ingresar datos duplicados.
import com.sun.xml.internal.stream.Entity;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.sevicios.AutorServicio;
import libreria.sevicios.EditorialServicio;
import libreria.sevicios.LibroServicio;

public class Libreria {

    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            String nombre, id, titulo;
            LibroServicio libroServicio = new LibroServicio();
            EditorialServicio editorialServicio = new EditorialServicio();
            AutorServicio autorServicio = new AutorServicio();
            int opc = 0;

            do {
                System.out.println("Seleccione una opcion");
                System.out.println("1.- Búsqueda de un Autor por nombre.");
                System.out.println("2.- Búsqueda de un libro por ISBN.");
                System.out.println("3.- Búsqueda de un libro por Título.");
                System.out.println("4.- Búsqueda de un libro/s por nombre de Autor.");
                System.out.println("5.- Búsqueda de un libro/s por nombre de Editorial.");
                System.out.println("6.- Crear autor.");
                System.out.println("7.- Salir");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Indique el nombre a buscar.");
                        nombre = leer.next();
                        List<Autor> a = autorServicio.listarPorNombre(nombre);
                        System.out.println(" ");
                        for (Autor autor : a) {

                            System.out.println(autor);
                        }
                        System.out.println(" ");
                        break;

                    case 2:
                        Libro libro=new Libro();
                        System.out.println("Indique el ISBN del libro a buscar");
                        id= leer.next();
                        System.out.println(" ");
                        libro=libroServicio.buscarPorIsbn(id);
                        System.out.println(libro);
                        break;

                    case 3:
                        System.out.println("Indique el Titulo de libro a buscar.");
                        titulo = leer.next();
                        libroServicio.listarPorTitulo(titulo);
                        System.out.println(" ");
                        
                        break;

                    case 4:
                        System.out.println("Indique el nombre del autor de los libros a buscar.");
                        nombre = leer.next();
                        libroServicio.listarPorNombreDeAutor(nombre);
                        System.out.println(" ");
                        break;

                    case 5:
                        break;

                    case 6:
                        System.out.println("Indique el nombre del autor.");
                        nombre = leer.next().toString();
                        autorServicio.crear(nombre);
                        break;

                }

            } while (opc != 7);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteServicio;

/**
 *
 * @author ana
 */
public final class ProductoDAO extends DAO {
    private FabricanteServicio fabricanteServicio;

    public ProductoDAO() {
        fabricanteServicio= new FabricanteServicio();
    }
    
    
    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            //INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
            String sql = "INSERT INTO producto VALUES ("
                    + producto.getCodigo() + ",'" + producto.getNombre() + "'," + producto.getPrecio() + "," + producto.getFabricante()+ ");";
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarNombreProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + producto.getNombre() + "' WHERE codigo= '" + producto.getCodigo() + "';";
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listarTodosLosProductos() throws Exception {
        try {

            String sql = "SELECT * FROM producto ";
            ConsultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante=(resultado.getInt(4));
                
                Fabricante f= fabricanteServicio.buscarFabricantePorcodigo(codigoFabricante);
                producto.setFabricante(f);
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
    
    public Collection<Producto> listarNombresPreciosTodosLosProductos() throws Exception {
        try {

            String sql = "SELECT nombre,precio FROM producto";
            ConsultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

   public Collection<Producto> listarProductoEntreDosValores(double num1,double num2) throws Exception {
        try {
            //SELECT * FROM PRODUCTO WHERE PRECIO BETWEEN 60 AND 200;
            String sql = "SELECT nombre,precio FROM producto WHERE PRECIO BETWEEN "+num1+" AND "+num2+";";
            ConsultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}

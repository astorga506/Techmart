/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import domain.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class ProductoData extends Conexion{
    
    private Producto producto;

    public ProductoData() {
        super();        
    }//PorductoData
    
    public LinkedList<Producto> getProductos(String nombre) throws SQLException{     
        Connection conexion = this.getConnection();
        String consulta = "{CALL sp_productos_por_nombre(?)}";      
        CallableStatement sentencia = conexion.prepareCall(consulta);
        sentencia.setString("Nombre", nombre);
        ResultSet resultados = sentencia.executeQuery();
        LinkedList<Producto> productos = new LinkedList<Producto>();
        
        while(resultados.next()){
            producto = new Producto();
            producto.setCodigoProducto(resultados.getInt("CodigoProducto"));
            producto.setNombre(resultados.getString("Nombre"));
            producto.setDescripcion(resultados.getString("Descripcion"));
            producto.getFabricante().setCodigoFabricante(resultados.getInt("CodigoFabricante"));
            producto.setAlto(resultados.getDouble("Alto"));
            producto.setAncho(resultados.getDouble("Ancho"));
            producto.setLargo(resultados.getDouble("Largo"));
            producto.setPeso(resultados.getDouble("Peso"));
            producto.setPrecio(resultados.getDouble("Precio"));
            producto.setCantidad(resultados.getInt("Precio"));
            producto.setImagen(resultados.getBytes("Imagen"));          
            
            productos.add(producto);
        }//while
        
        conexion.close();
        
        return productos;
    }//getProductos
    
    
    public Producto insertarProducto(Producto producto) throws SQLException{
        Connection conexion = this.getConnection();
        String consulta = "{CALL sp_insertar_producto(?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement sentencia = conexion.prepareCall(consulta);
        
        sentencia.registerOutParameter("CodigoProducto", Types.INTEGER);
        sentencia.setInt("CodigoFabricante",producto.getFabricante().getCodigoFabricante());
        sentencia.setDouble("Peso", producto.getPeso());
        sentencia.setDouble("Largo", producto.getLargo());
        sentencia.setDouble("Ancho", producto.getAncho());
        sentencia.setDouble("Alto", producto.getAlto());
        sentencia.setString("Descripcion", producto.getDescripcion());
        sentencia.setString("Nombre", producto.getNombre());
        sentencia.setInt("Cantidad", producto.getCantidad());
        sentencia.setDouble("Precio", producto.getPrecio());
        sentencia.setBytes("Imagen", producto.getImagen());
        
        sentencia.executeUpdate();
        producto.setCodigoProducto(sentencia.getInt("CodigoProducto"));
        
        conexion.close();
        
        return producto;        
    }
    
}//class

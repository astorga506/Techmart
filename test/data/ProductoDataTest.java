/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Fabricante;
import domain.Producto;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class ProductoDataTest {

    ProductoData prod;

    public ProductoDataTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        
        prod = new ProductoData();
//        
//        try {
//            
//            Producto prod1 = new Producto();
//            Producto prod2 = new Producto();
//            Producto prod3 = new Producto();
//            Producto prod4 = new Producto();
//            Producto prod5 = new Producto();
//            Producto prod6 = new Producto();
//            Producto prod7 = new Producto();
//            Producto prod8 = new Producto();
//            Producto prod9 = new Producto();
//            Producto prod10 = new Producto();
//            Producto prod11 = new Producto();
//
//            prod1.getFabricante().setCodigoFabricante(1);
//            prod1.setAlto(7.366);
//            prod1.setAncho(24.13);
//            prod1.setLargo(32.766);
//            prod1.setCantidad(53);
//            prod1.setDescripcion("Tarjeta Grafica");
//            File img1 = new File("C:\\Users\\Carlos\\Downloads\\71Be6JbkpHL._SL1500_.jpg");
//            byte[] cont1 = Files.readAllBytes(img1.toPath());
//            prod1.setImagen(cont1);
//            prod1.setNombre("EVGA GeForce GTX760 w/EVGA ACX Cooler 2GB");
//            prod1.setPeso(1.470);
//            prod1.setPrecio(200000);
//
//            prod2.getFabricante().setCodigoFabricante(2);
//            prod2.setAlto(8.382);
//            prod2.setAncho(21.082);
//            prod2.setLargo(47.244);
//            prod2.setCantidad(27);
//            prod2.setDescripcion("Teclado mecanico retroiluminado");
//            File img2 = new File("C:\\Users\\Carlos\\Downloads\\61yh4gleD3L._SL1500_.jpg");
//            byte[] cont2 = Files.readAllBytes(img2.toPath());
//            prod2.setImagen(cont2);
//            prod2.setNombre("Corsair Vengeance K70 Cherry MX Brown");
//            prod2.setPeso(2.150);
//            prod2.setPrecio(125000);
//
//            prod3.getFabricante().setCodigoFabricante(3);
//            prod3.setAlto(5.842);
//            prod3.setAncho(29.718);
//            prod3.setLargo(35.052);
//            prod3.setCantidad(73);
//            prod3.setDescripcion("Tarjeta madre");
//            File img3 = new File("C:\\Users\\Carlos\\Downloads\\51XovCPDOGL.jpg");
//            byte[] cont3 = Files.readAllBytes(img3.toPath());
//            prod3.setImagen(cont3);
//            prod3.setNombre("Asus P8Z77-V LK");
//            prod3.setPeso(1.27);
//            prod3.setPrecio(120000);
//
//            prod4.getFabricante().setCodigoFabricante(6);
//            prod4.setAlto(8.128);
//            prod4.setAncho(14.478);
//            prod4.setLargo(12.7);
//            prod4.setCantidad(46);
//            prod4.setDescripcion("Procesador");
//            File img4 = new File("C:\\Users\\Carlos\\Downloads\\71BQ-XMNtUL._SL1500_.jpg");
//            byte[] cont4 = Files.readAllBytes(img4.toPath());
//            prod4.setImagen(cont4);
//            prod4.setNombre("Intel Core i5-3570K");
//            prod4.setPeso(0.385);
//            prod4.setPrecio(180000);
//
//            prod5.getFabricante().setCodigoFabricante(2);
//            prod5.setAlto(2.5400);
//            prod5.setAncho(7.6200);
//            prod5.setLargo(10.160);
//            prod5.setCantidad(37);
//            prod5.setDescripcion("Memoria RAM");
//            File img5 = new File("C:\\Users\\Carlos\\Downloads\\51VKO8GSGNL.jpg");
//            byte[] cont5 = Files.readAllBytes(img5.toPath());
//            prod5.setImagen(cont5);
//            prod5.setNombre("Corsair Vengeance 8GB DDR3 1600MHz");
//            prod5.setPeso(0.119);
//            prod5.setPrecio(80000);
//
//            prod6.getFabricante().setCodigoFabricante(7);
//            prod6.setAlto(0.762);
//            prod6.setAncho(7.112);
//            prod6.setLargo(9.906);
//            prod6.setCantidad(23);
//            prod6.setDescripcion("Unidad de estado solido");
//            File img6 = new File("C:\\Users\\Carlos\\Downloads\\61XgXJor1xL._SL1500_.jpg");
//            byte[] cont6 = Files.readAllBytes(img6.toPath());
//            prod6.setImagen(cont6);
//            prod6.setNombre("Samsung 840 EVO 250GB");
//            prod6.setPeso(0.41);
//            prod6.setPrecio(125000);
//
//            prod7.getFabricante().setCodigoFabricante(2);
//            prod7.setAlto(8.636);
//            prod7.setAncho(14.986);
//            prod7.setLargo(16.002);
//            prod7.setCantidad(42);
//            prod7.setDescripcion("Fuente de poder semimodular");
//            File img7 = new File("C:\\Users\\Carlos\\Downloads\\41zsoaWitgL.jpg");
//            byte[] cont7 = Files.readAllBytes(img7.toPath());
//            prod7.setImagen(cont7);
//            prod7.setNombre("Corsair TX 750 80 PLUS Bronze");
//            prod7.setPeso(3.4473);
//            prod7.setPrecio(125000);
//
//            prod8.getFabricante().setCodigoFabricante(2);
//            prod8.setAlto(26.924);
//            prod8.setAncho(55.88);
//            prod8.setLargo(50.546);
//            prod8.setCantidad(53);
//            prod8.setDescripcion("Unidad de estado solido");
//            File img8 = new File("C:\\Users\\Carlos\\Downloads\\61k+utIGpvL._SL1500_.jpg");
//            byte[] cont8 = Files.readAllBytes(img8.toPath());
//            prod8.setImagen(cont8);
//            prod8.setNombre("Corsair Carbide 200R ");
//            prod8.setPeso(7.2121);
//            prod8.setPrecio(95000);
//
//            prod9.getFabricante().setCodigoFabricante(5);
//            prod9.setAlto(2.032);
//            prod9.setAncho(14.732);
//            prod9.setLargo(14.732);
//            prod9.setCantidad(65);
//            prod9.setDescripcion("Sistema operativo Windows");
//            File img9 = new File("C:\\Users\\Carlos\\Downloads\\31oGjt4LCTL.jpg");
//            byte[] cont9 = Files.readAllBytes(img9.toPath());
//            prod9.setImagen(cont9);
//            prod9.setNombre("Microsoft Windows 8.1 - Full Version");
//            prod9.setPeso(0.1134);
//            prod9.setPrecio(80000);
//
//            prod10.getFabricante().setCodigoFabricante(4);
//            prod10.setAlto(4.572);
//            prod10.setAncho(11.938);
//            prod10.setLargo(6.604);
//            prod10.setCantidad(11);
//            prod10.setDescripcion("Mouse optico para videojuegos");
//            File img10 = new File("C:\\Users\\Carlos\\Downloads\\71ElpjpEE4L._SL1500_.jpg");
//            byte[] cont10 = Files.readAllBytes(img10.toPath());
//            prod10.setImagen(cont10);
//            prod10.setNombre("ROCCAT Lua");
//            prod10.setPeso(0.2806);
//            prod10.setPrecio(50000);
              
//            prod11.getFabricante().setCodigoFabricante(8);
//            prod11.setAlto(8.89);
//            prod11.setAncho(22.860);
//            prod11.setLargo(15.748);
//            prod11.setCantidad(7);
//            prod11.setDescripcion("Ventilador para CPU");
//            File img11 = new File("C:\\Users\\Carlos\\Downloads\\91wN1wFlqzL._SL1500_.jpg");
//            byte[] cont11 = Files.readAllBytes(img11.toPath());
//            prod11.setImagen(cont11);
//            prod11.setNombre("Cooler Master Hyper 212 EVO");
//            prod11.setPeso(0.9072);
//            prod11.setPrecio(45000);
//
//            prod.insertarProducto(prod1);
//            prod.insertarProducto(prod2);
//            prod.insertarProducto(prod3);
//            prod.insertarProducto(prod4);
//            prod.insertarProducto(prod5);
//            prod.insertarProducto(prod6);
//            prod.insertarProducto(prod7);
//            prod.insertarProducto(prod8);
//            prod.insertarProducto(prod9);
//            prod.insertarProducto(prod10);
//            prod.insertarProducto(prod11);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductoDataTest.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ProductoDataTest.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

    @After
    public void tearDown() {
    }

    @Test
    public void Consulta() {
        try {
            LinkedList<Producto> productos = prod.getProductos("GTX760");
            
            System.out.println("Codigo Producto   |   Nombbre   |   Descripcion   |   Precio");
            
            
            System.out.print(String.valueOf(productos.getFirst().getCodigoProducto()));
            System.out.print(String.valueOf(productos.getFirst().getNombre()));
            System.out.print(String.valueOf(productos.getFirst().getDescripcion()));
            System.out.print(String.valueOf(productos.getFirst().getPrecio()));
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

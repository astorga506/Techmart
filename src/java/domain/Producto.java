/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Carlos
 */
public class Producto {
    
    private int codigoProducto;
    private Fabricante fabricante;
    private double peso;
    private double largo;
    private double ancho;
    private double alto;
    private String descripcion;
    private String nombre;
    private int cantidad;
    private double precio;
    private byte[] imagen;  

    public Producto() {
        fabricante = new Fabricante();
    }

    public Producto(int codigoProducto, Fabricante fabricante, double peso, double largo, double ancho, double alto,
                    String descripcion, String nombre, int cantidad, double precio, byte[] imagen) {
        this.codigoProducto = codigoProducto;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
}

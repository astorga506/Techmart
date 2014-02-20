/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class Usuario {
    
    private int codigoUsuario;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String provincia;
    private String canton;
    private String distrito;
    private String codigoPostal;
    private String email;
    private String telefono;
    private String contrasena;
    private LinkedList<Detalle> carrito;

    public Usuario() {      
        carrito = new LinkedList<Detalle>();
    }

    public Usuario(int codigoUsuario, String nombre, String primerApellido, String segundoApellido, String direccion, String provincia, String canton, String distrito, String codigoPostal, String email, String telefono, String contrasena, LinkedList<Detalle> carrito) {
        this.codigoUsuario = codigoUsuario;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.carrito = carrito;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }     

    public LinkedList<Detalle> getCarrito() {
        return carrito;
    }

    public void setCarrito(LinkedList<Detalle> carrito) {
        this.carrito = carrito;
    }
    
    
}

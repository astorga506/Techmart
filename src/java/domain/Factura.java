/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class Factura {
    
    private int numOrden;
    private int cantidad;
    private Date fecha;
    private Usuario usuario;
    private LinkedList<Detalle> detalles;

    public Factura() {
        usuario = new Usuario();
        detalles = new LinkedList<Detalle>();
    }

    public Factura(int numOrden, int cantidad, Date fecha, Usuario usuario, LinkedList<Detalle> detalles) {
        this.numOrden = numOrden;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.usuario = usuario;
        this.detalles = detalles;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LinkedList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(LinkedList<Detalle> detalles) {
        this.detalles = detalles;
    }

}

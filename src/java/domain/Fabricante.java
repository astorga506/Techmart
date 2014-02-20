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
public class Fabricante {
    
    private int codigoFabricante;
    private String nombre;
    private String sitioWeb;

    public Fabricante() {
    }

    public Fabricante(int codigoFabricante, String nombre, String sitioWeb) {
        this.codigoFabricante = codigoFabricante;
        this.nombre = nombre;
        this.sitioWeb = sitioWeb;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
            
}

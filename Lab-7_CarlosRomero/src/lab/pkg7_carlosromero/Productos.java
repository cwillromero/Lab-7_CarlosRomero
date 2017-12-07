/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_carlosromero;

import java.io.Serializable;

/**
 *
 * @author Will
 */
public class Productos implements Serializable{
    private String nombre; 
    private double precio;
    private int tiempo;
    private static final long SerialVersionUID=2010L;

    public Productos() {
    }

    public Productos(String nombre, double precio, int tiempo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}

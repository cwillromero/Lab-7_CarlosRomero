/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_carlosromero;

/**
 *
 * @author Will
 */
public class Cliente {
     private String nombre; 
     private int edad;
     private Orden orden;

     public Cliente(String nombre, int edad, Orden orden) {
        this.nombre = nombre;
        this.edad = edad;
        this.orden = orden;
    }

    public Cliente() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }


    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", orden=" + orden + '}';
    }
     
    
}

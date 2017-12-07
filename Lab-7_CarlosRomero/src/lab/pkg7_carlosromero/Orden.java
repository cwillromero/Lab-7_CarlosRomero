/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_carlosromero;

import java.util.ArrayList;

/**
 *
 * @author Will
 */
public class Orden {
    private Cajeros cajero; 
    private Cliente cliente;
    private ArrayList<Productos> productos;

    public Orden(Cajeros cajero, Cliente cliente, ArrayList<Productos> productos) {
        this.cajero = cajero;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Orden() {
    }

    public Cajeros getCajero() {
        return cajero;
    }

    public void setCajero(Cajeros cajero) {
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_carlosromero;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Will
 */
public class Cajeros implements Serializable{
    
    private String Nombre;
    private int ID;
    private ArrayList<Orden> ordenes=new ArrayList();
    private static final long SerialVersionUID=2010L;
    
    public Cajeros() {
    }

    public Cajeros(String Nombre, int ID) {
        this.Nombre = Nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return Nombre + ordenes;
    }
    
    
}

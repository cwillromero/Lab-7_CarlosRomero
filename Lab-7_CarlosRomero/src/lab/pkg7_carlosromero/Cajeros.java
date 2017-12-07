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
    private String ID;
    private ArrayList<Orden> ordenes=new ArrayList();
    private static final long SerialVersionUID=2010L;
    
    public Cajeros() {
    }

    public Cajeros(String Nombre, String ID) {
        this.Nombre = Nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList ordenes) {
        this.ordenes = ordenes;
    }
    
    
    
}

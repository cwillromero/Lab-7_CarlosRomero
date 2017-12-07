/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_carlosromero;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Will
 */
public class Cajeros implements Serializable, Runnable {

    private Orden orden;
    private boolean Run=true;
    private String Nombre;
    private Ventana Ventana = new Ventana();
    private int ID;
    private ArrayList<Orden> ordenes = new ArrayList();
    private static final long SerialVersionUID = 2010L;

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
    
    public void Seguir(){
        this.Run=true;
    } 

    @Override
    public String toString() {
        return Nombre;
    }

    public Ventana getVentana() {
        return Ventana;
    }

    public void setVentana(Ventana Ventana) {
        this.Ventana = Ventana;
    }

    @Override
    public void run() {
        Ventana.CajeroNombre.setText(Nombre);
        Ventana.ClienteNombre.setText(orden.getCliente().getNombre());
        while (Run==true) {
            for (int i = 0; i < orden.getProductos().size(); i++) {
                int tiempo = (orden.getProductos().get(i).getTiempo()) * 1000;
                try {
                    Ventana.tfProceso.setText(orden.getProductos().get(i).getNombre());
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cajeros.class.getName()).log(Level.SEVERE, null, ex);
                }
                Ventana.tfProceso.setText("");
                DefaultTableModel modelo = (DefaultTableModel) Ventana.Tabla.getModel();
                Object[] newRow = {orden.getProductos().get(i).getNombre(), orden.getCliente().getNombre(), orden.getProductos().get(i).getTiempo()};
                modelo.addRow(newRow);
                Ventana.Tabla.setModel(modelo);
            }
            try {

                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
            Run=false;
        }

    }

    //Extra 
    public void EnviarOrden(Orden estaorden) {
        this.orden = estaorden;
    }
    
}

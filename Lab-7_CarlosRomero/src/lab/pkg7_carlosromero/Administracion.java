/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_carlosromero;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTree;

/**
 *
 * @author Will
 */
public class Administracion implements Serializable{
    private ArrayList todo=new ArrayList();
    private File archivo;
    private static final long SerialVersionUID=2010L;

    public Administracion(String Path) {
        archivo=new File(Path);
    }

    public void setTodo(ArrayList todo) {
        this.todo = todo;
    }
    
    public void AgregarElemento(Object X){
        todo.add(X);
    }
    
    public void EscribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object T : todo) {
                bw.writeObject(T);
            }
            bw.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error durante el guardado!", "Error", 0);
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void CargarArchivo() {
        try {
            todo = new ArrayList();
            Object esto;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while (((esto = objeto.readObject()) != null) || ((esto = ((Component)objeto.readObject())) != null)) {
                        todo.add(esto);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
}

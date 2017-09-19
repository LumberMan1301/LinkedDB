package Logica.JSONStore;

import Estructuras.de.Listas.ListaDoble.ListaDoble;

import javax.swing.*;
import java.io.File;

/**
 * Created by 13mariano on 7 sep 2017.
 */
public class JSONStore {
    private static ListaDoble listaJsonStores = new ListaDoble();
    private String nombre;
//---------Constructor de la clase-------------------------------------//
    public JSONStore(String nombre) {
        this.nombre = nombre;
    }
//---------------------------------------------------------------------//

//------------metodos de acceso publico--------------------------------//
    public static void crear(String nombre){
        crearP(nombre);
    }

    public static void eliminar(String nombre){
        eliminarP(nombre);
    }

//---------------------------------------------------------------------//
//-------------metodos de acceso privado-------------------------------//
    //metodo para cear carpetas
    private static void crearP(String nombre){
        File folder = new File("C:\\Users\\maria\\Desktop\\Codigos\\LinkedDB\\JSONStores\\"+nombre);

        if (folder.exists()) {
            JOptionPane.showMessageDialog(null, "La carpeta ya existe");
        }else {
            folder.mkdirs();
            JOptionPane.showMessageDialog(null, "La carpeta ha sido creada");
            listaJsonStores.insertarFinalLD(nombre);
        }
    }

    //metodo para eliminar carpetas
    private static void eliminarP(String nombre){
        File folder = new File("C:\\Users\\maria\\Desktop\\Codigos\\LinkedDB\\JSONStores\\"+nombre);
        if (folder.exists()){
            folder.delete();
            JOptionPane.showMessageDialog(null, "La carpeta ha sido eliminada");
        }else{
            JOptionPane.showMessageDialog(null, "La carpeta no existe");
        }
    }

}

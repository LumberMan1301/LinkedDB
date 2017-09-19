package Logica.ObjetoJSON;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 13mariano on 18 sep 2017.
 */
public class ObjetoJSON {



    public static void crearJSON(String nombre){
        crearJSONP(nombre);
    }

    public static void insertar (){

    }

    private static void crearJSONP(String nombre){

        JSONObject object = new JSONObject();
        try {
            FileWriter file = new FileWriter("C:\\Users\\maria\\Desktop\\Codigos\\LinkedDB\\JSONStores\\"+nombre+".json");
            file.write(object.toJSONString());
            file.flush();
            file.close();
        }catch (IOException e){
            //maneja el error
        }


    }



}

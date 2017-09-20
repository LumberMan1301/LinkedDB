package Logica.DocumentoJSON;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 13mariano on 7 sep 2017.
 */
public class DocumentoJson {
    public static void crearDocumento(String nombre){
        crearJSONP(nombre);
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

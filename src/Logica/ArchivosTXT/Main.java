package Logica.ArchivosTXT;

import java.io.*;

/**
 * Created by 13mariano on 18 sep 2017.
 */
public class Main {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            escribir();
            leer();
        }

        public static void escribir()
        {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try
            {
                fichero = new FileWriter("archivo.txt");
                pw = new PrintWriter(fichero);

                System.out.println("Escribiendo en el archivo.txt");
                for (int i = 0; i < 10; i++)
                    pw.println("Linea " + i);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally para
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        public static void leer()
        {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File ("archivo.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                System.out.println("Leyendo el contendio del archivo.txt");
                String linea;
                while((linea=br.readLine())!=null)
                    System.out.println(linea);
            }
            catch(Exception e){
                e.printStackTrace();
            }finally{
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta
                // una excepcion.
                try{
                    if( null != fr ){
                        fr.close();
                    }
                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
}

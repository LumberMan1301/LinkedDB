package Estructuras.de.Listas.ListaSimple;

/**
 * Created by 13mariano on 23 ago 2017.
 */
public class MainLS {
    public static void main (String [] args){
        ListaSimple lista1 = new ListaSimple();

        lista1.insertarFinalLS(1);
        lista1.insertarFinalLS(0);
        lista1.insertarFinalLS(2);
        lista1.insertarFinalLS(1);
        lista1.insertarFinalLS(0);





        lista1.imprimirLS();

        lista1.buscarporValorLS(1);


    }
}

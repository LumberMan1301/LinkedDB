package Estructuras.de.Listas.ListaSimple;


import Estructuras.de.Listas.Nodo.Nodo;

public class ListaSimple <T> {
//--------------------------------------------------//
//atributos de la clase ListaSimple
    private Nodo<T> head;// Nodo que hace refere
    private int capacidad;// atributo que hace referencia al tamaño de la lista
//---------------------------------------------------//
//constructor de la clase, que inicializa los valores en nulos
    public ListaSimple(){
        this.head=null;
        this.capacidad=0;
        }
//-----------metodos de acceso publico----------------//
    public void insertarFinalLS(T dato){
        insertarFinalPLS(dato);
    }

    public void insertarInicioLS(T dato){
        insertarAlInicioPLS(dato);
    }

    public void insertarPosLS(T dato, int pos){
        insertarPorPosPLS(dato, pos);
    }

    public void eliminarPorValorLS(T dato){
        eliminarPorValorPLS(dato);
    }

    public void eliminarPosLS(int pos){
        eliminarPorPosPLS(pos);
    }

    public void eliminarPrimeroLS(){
        eliminarPrimeroPLS();
    }

    public void eliminarUltimoLS(){
        eliminarUltimoPLS();
    }

    public  void buscarporValorLS(T dato){
        buscarPorValorPLS(dato);
    }

    public void imprimirLS(){
        imprimirPLS();
    }

    public boolean esVaciaLS(){

        if (capacidad==0){
            return true;
        }else {
            return false;
        }
    }
//-----fin de los metodos de acceso publico----------------//

//------metodos de acceso privado--------------------------//
    // metodo para insertar al final
    private void insertarFinalPLS(T dato){
        if (esVaciaLS()) {
            this.head=new Nodo<T>(dato);;
            capacidad++;
        }else{
            Nodo<T> actual = head;
            while (actual.getSiguiente()!= null){
                actual=actual.getSiguiente();
            }
            Nodo<T> aux = new Nodo<>(dato);
            aux.setSiguiente(null);
            actual.setSiguiente(aux);
            capacidad++;
        }
    }

    //metodo para insertar al inicio
    private void insertarAlInicioPLS(T dato){
        if (esVaciaLS()){
            head = new Nodo(dato);
            capacidad++;
        }else{
            Nodo aux = new Nodo(dato);
            aux.setSiguiente(head);
            head = aux;
            capacidad++;
        }

    }

    //metodo para insertar por posision
    private void insertarPorPosPLS(T dato, int pos){
        if (esVaciaLS()){
            System.out.println("la lista esta vacia");
        }else if(pos >= capacidad){
            System.out.println("Fuera de rango");
        }else {
            if (pos == 0){
                insertarAlInicioPLS(dato);
                capacidad++;
            }else if(pos == capacidad-1){
                insertarFinalPLS(dato);
                capacidad++;
            }else {

                //System.out.println(head.getDato());
                Nodo<T> actual = head;
                //System.out.println(actual.getDato());
                Nodo aux = new Nodo(dato);
                for (int i=0; i<pos-1;i++){
                    actual = actual.getSiguiente();
                }
                aux.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(aux);
                capacidad++;
            }
        }

    }

    //metodo para eliminar al final
    private void eliminarPorValorPLS(T dato){
        if (esVaciaLS()){
            System.out.println("La Lista esta vacia");
        }else{
                Nodo<T> actual = head;
                while (actual.getSiguiente()!=null){
                    if(head.getDato()==dato){
                        head=head.getSiguiente();
                    }else if (actual.getSiguiente().getDato()==dato){
                        Nodo siguiente = actual.getSiguiente().getSiguiente();
                        actual.setSiguiente(siguiente);
                        capacidad--;
                    }else{
                        actual=actual.getSiguiente();
                    }
                }

            }

        }

    //fin del metddo de eliminar al final
    private void eliminarPorPosPLS(int pos){

        if(esVaciaLS()){
            System.out.println("La Lista esta vacia");
        }else{
            if (pos-1 >= capacidad){
                System.out.println("Posicion Fuera de Rango");
            }else {
                    if (pos == 0) {
                        eliminarPrimeroPLS();
                    }else {
                        Nodo aux = head;
                        for (int i = 0; i < pos - 1; i++) {
                            aux = aux.getSiguiente();
                        }
                        Nodo siguiente = aux.getSiguiente();
                        aux.setSiguiente(siguiente.getSiguiente());
                    }
                capacidad--;
            }
        }
    }

    //metodo para eliminar el primer elemento de una lista
    private void eliminarPrimeroPLS(){
        if (esVaciaLS()){
            System.out.println("La Lista Esta Vacia");
        }else{
            head=head.getSiguiente();
            capacidad--;
        }
    }

    //metodo para eliminar el ultimo elemento
    private void eliminarUltimoPLS(){
        if (esVaciaLS()){
            System.out.println("Lista Vacia");
        }else{
            Nodo actual = head;
            for (int i=0; i<capacidad-2;i++){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(null);
            capacidad--;
        }
    }

    //metodo para buscar por valor
    private int buscarPorValorPLS(T dato){
        int cant = 0;
        if (esVaciaLS()){
            System.out.println("Lista vacia");
            return cant;
        }else{
            int pos =0;
            Nodo actual = head;
            while (pos !=capacidad-1){
                if (actual.getDato().equals(dato)){
                    actual = actual.getSiguiente();
                    cant++;
                    pos++;

                }else{
                    actual = actual.getSiguiente();
                    pos++;
                }
            }System.out.println("El dato se repite: "+ cant);


        }

        return cant;
    }

    //metodo para imprimir la lista
    private void imprimirPLS() {
        if (capacidad==0){
            System.out.println("La Lista esta vacia");
        }else{
            Nodo<T> actual = head;
            System.out.print("[");
            while (actual.getSiguiente()!=null){
                System.out.print(actual.getDato()+",");
                actual=actual.getSiguiente();
                }
                System.out.print(actual.getDato());
                System.out.print("]\n");
            }

    }
//------------------------------------------------------------//
    
    
//-------metodos de obtener y asignar----------//
    public Nodo<T> getHead() {
        return head;
    }
    public void setHead(Nodo<T> head) {
        this.head = head;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


}

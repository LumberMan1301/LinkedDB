package Estructuras.de.Listas.ListaDoble;


import Estructuras.de.Listas.Nodo.Nodo;

public class ListaDoble <T>{
//------------------declaracion de atributos--------------//
	private Nodo<T> first;
	private Nodo <T> last;
	private int capacidad;
//--------------------------------------------------------//
	
//--------------constructor de la clase-------------------//
	public ListaDoble() {
		this.first=null;
		this.last=null;
		this.capacidad=0;
	}
//--------------------------------------------------------//
	
//---------metodos de acceso publico----------------------//
	public void insertarFinalLD(T dato) {
		insertarFinalP(dato);
	}
	
	public void insertarInicioLD(T dato) {
		insertarInicioPLD(dato);
	}
	
	public void insertarPorPosLD(T dato, int pos) {
		insertarPorPosPLD(dato, pos);
	}
	
	public void imprimirLD(){
	       imprimirLDP();
	}

	public int buscarPorValorLD(T dato){
		return buscarporValorPLD(dato);
	}
	
	public boolean esVaciaLD() {
		if (capacidad==0) {
			return true;
		}else {
			return false;
		}
	}
//--------------------------------------------------------//
	
//------------metodos de acceso privado-------------------//
	//metodo para insertar al final
	private void insertarFinalP(T dato) {
		if(esVaciaLD()) {
			this.first=this.last=new Nodo<T> (dato);
			capacidad++;
		}else {
			Nodo aux = new Nodo(dato);
			aux.setAnterior(last);
			last.setSiguiente(aux);
			last=aux;
		}	
	}
	
	//metodo para insertar al inicio
	private void insertarInicioPLD(T dato) {
		if (esVaciaLD()) {
			first=last=new Nodo(dato);
			capacidad ++;
		}else{
			Nodo aux = new Nodo(dato);
			first.setAnterior(aux);
			aux.setSiguiente(first);
			first=aux;
			capacidad++;
		}
	}
	
	//metodo para insertar por posicion
	private void insertarPorPosPLD(T dato, int pos) {
		if (esVaciaLD()) {
			System.out.println("la lista esta vacia");
		}else {
			if (pos==0) {
				insertarInicioPLD(dato);
				capacidad++;
			}else if(pos == capacidad-1) {
				insertarFinalP(dato);
				capacidad++;
			}else {
				Nodo <T> actual = first;
				Nodo aux=new Nodo(dato);
				for (int i=0; i<pos; i++) {
					actual = actual.getSiguiente();
				}
				aux.setSiguiente(actual.getSiguiente());
				actual.getSiguiente().setAnterior(aux);
				aux.setAnterior(actual);
				actual.setSiguiente(aux);
				capacidad++;
			}
		}
	}

	//metodo para buscar por valor
	private int buscarporValorPLD(T dato){
		int cant = 0;
		if (esVaciaLD()){
			System.out.println("Lista vacia");
			return cant;
		}else{
			int pos =0;
			Nodo actual = first;
			while (pos !=capacidad-1){
				if (actual.getDato().equals(dato)){
					actual = actual.getSiguiente();
					pos++;
					cant++;
				}else{
					actual = actual.getSiguiente();
					pos++;
				}
			}System.out.println("El dato se repite: "+ cant);


		}

		return cant;
	}

	//metodo para imprimir
	private void imprimirLDP() {
        if (esVaciaLD()){
            System.out.println("La Lista esta vacia");
        }else{
            Nodo<T> actual = first;
            System.out.print("[");
            while (actual.getSiguiente()!=null){
                System.out.print(actual.getDato()+",");
                actual=actual.getSiguiente();
                }
                System.out.print(actual.getDato());
                System.out.print("]\n");
            }

    }
}

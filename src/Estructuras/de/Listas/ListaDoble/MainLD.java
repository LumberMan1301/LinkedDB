package Estructuras.de.Listas.ListaDoble;

public class MainLD {
	public static void main(String [] args) {
		ListaDoble ld1 = new ListaDoble();
		ld1.insertarFinalLD(50);
		ld1.insertarFinalLD(20);
		
		ld1.insertarInicioLD(13);
		
		
		ld1.insertarPorPosLD(15, 2);
		ld1.imprimirLD();
		
	}
}

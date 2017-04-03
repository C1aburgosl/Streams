package package2;

public class Nodo {
	protected int dato;
	protected Nodo izdo;
	protected Nodo dcho;
	

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getIzdo() {
		return izdo;
	}

	public void setIzdo(Nodo izdo) {
		this.izdo = izdo;
	}

	public Nodo getDcho() {
		return dcho;
	}

	public void setDcho(Nodo dcho) {
		this.dcho = dcho;
	}

	public Nodo(int valor) {
		dato = valor;
		izdo = dcho = null;
	}

	public Nodo(Nodo ramaIzdo, int valor, Nodo ramaDcho) {
		this.dato = valor;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}

	// operaciones de acceso
	public int valorNodo() {
		return dato;
	}

	public Nodo subarbolIzdo() {
		return izdo;
	}

	public Nodo subarbolDcho() {
		return dcho;
	}

	public void nuevoValor(int d) {
		dato = d;
	}

	public void ramaIzdo(Nodo n) {
		izdo = n;
	}

	public void ramaDcho(Nodo n) {
		dcho = n;
	}
	public void visitar(){
		System.out.print(dato + " ");
	}
}

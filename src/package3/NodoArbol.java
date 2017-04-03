package package3;
import java.io.*;

public class NodoArbol implements Serializable{
	
	protected String nombre;
	protected int nota;
	protected NodoArbol izdo;
	protected NodoArbol dcho;
	

	public NodoArbol(String nombre,int nota) {
		this.nombre = nombre;
		this.nota=nota;
		izdo = dcho = null;
	}

	public NodoArbol(NodoArbol ramaIzdo, String nombre,int nota,  NodoArbol ramaDcho) {
		this.nombre = nombre;
		this.nota=nota;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}

	

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public NodoArbol getIzdo() {
		return izdo;
	}

	public void setIzdo(NodoArbol izdo) {
		this.izdo = izdo;
	}

	public NodoArbol getDcho() {
		return dcho;
	}

	public void setDcho(NodoArbol dcho) {
		this.dcho = dcho;
	}


	
	public void visitar(){
		System.out.print(nombre + ", " + nota + "\n");
	}
}

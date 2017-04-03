package package1;

import java.io.*;

public class Nodo implements Serializable {
	private String nombre;
	private int nota;
	Nodo enlace;

	public Nodo getEnlace() {
		return enlace;
	}

	Nodo(String n, int no) {
		nombre = n;
		nota = no;
		enlace = null;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNota() {
		return nota;
	}
}

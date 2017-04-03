package package3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ObjectOutputStream nom = null;
		ArbolBinario arbol = new ArbolBinario();
		package1.Lista lista=new package1.Lista("notas.not");
		File f =new File("alumnos.not");
		String l;
		
		lista.cargar();
		
		
		
		while (lista.getCab() != null) {
			
			arbol.insertar(arbol.raizArbol(), lista.getCab().getNombre(), lista.getCab().getNota());
			lista.eliminarPrimero();
		}
		
		try {
			
			nom = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			nom.writeObject(arbol.raizArbol());
		
			
			
			
		} finally {
			
			if (nom != null) {
				nom.close();
			}
		}
		
		
		
		System.out.println("Recorrido Pre Orden");
		preorden(arbol.raiz);
		System.out.println();
		System.out.println("Recorrido In Orden");
		inorden(arbol.raiz);
		System.out.println();
		System.out.println("Recorrido Post Orden");
		postorden(arbol.raiz);
		System.out.println();
		}
		
		
		
		
		
		public static void preorden(NodoArbol r) {
			if (r != null) {
				r.visitar();
				preorden(r.getIzdo());
				preorden(r.getDcho());
			}
		}

		// Recorrido de un árbol binario en inorden
		public static void inorden(NodoArbol r) {
			if (r != null) {
				inorden(r.getIzdo());
				r.visitar();
				inorden(r.getDcho());
			}
		}

		// Recorrido de un árbol binario en postorden
		public static void postorden(NodoArbol r) {
			if (r != null) {
				postorden(r.getIzdo());
				postorden(r.getDcho());
				r.visitar();
			}
		}
		
	
		 
	}
	


	    

	
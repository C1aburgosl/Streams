package package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;




public class Ejercicio2 {
	public static void main(String[] args) throws IOException {

		BufferedReader num = null;
		File n = new File("Notas.txt");
		ArbolBinario numeros=new ArbolBinario();
		String l;
		
		
		
		try {
			
			num = new BufferedReader(new FileReader(n));

		
			while ((l = num.readLine()) != null) {
				
				numeros.insertar(numeros.raizArbol(), Integer.parseInt(l));
			}
			
			
		} finally {
			
			if (num != null) {
				num.close();
			}
		}
		// Diferentes recorridos
				System.out.println("Recorrido Pre Orden");
				preorden(numeros.raiz);
				System.out.println();
				System.out.println("Recorrido In Orden");
				inorden(numeros.raiz);
				System.out.println();
				System.out.println("Recorrido Post Orden");
				postorden(numeros.raiz);
				System.out.println();
			
				 
			}

			public static void preorden(Nodo r) {
				if (r != null) {
					r.visitar();
					preorden(r.getIzdo());
					preorden(r.getDcho());
				}
			}

			// Recorrido de un árbol binario en inorden
			public static void inorden(Nodo r) {
				if (r != null) {
					inorden(r.getIzdo());
					r.visitar();
					inorden(r.getDcho());
				}
			}

			// Recorrido de un árbol binario en postorden
			public static void postorden(Nodo r) {
				if (r != null) {
					postorden(r.getIzdo());
					postorden(r.getDcho());
					r.visitar();
				}
			}
		

	}



package package3;
import java.io.*;

public class ArbolBinario implements Serializable {
	protected NodoArbol raiz;

	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(NodoArbol raiz) {
		this.raiz = raiz;
	}

	public NodoArbol raizArbol() {
		return raiz;
	}

	// Comprueba el estatus del árbol
	boolean esVacio() {
		return raiz == null;
	}

	public static NodoArbol nuevoArbol(NodoArbol ramaIzqda, String nombre,int nota, NodoArbol ramaDrcha) {
		return new NodoArbol(ramaIzqda, nombre,nota, ramaDrcha);
	}
	
	public static int contarHojas(NodoArbol r){
		if(r==null){
			return 0;
		}else {
			if(r.getIzdo()==null && r.getDcho()==null){
				return 1;
				
			}else{
				return contarHojas(r.getIzdo())+contarHojas(r.getDcho());
			}
		}
	}
	public void insertar(NodoArbol n,String i, int e){
		if (n == null){
			raiz=new NodoArbol(i,e);
			
		}else if (n.getNombre().compareTo(i)>0 ){
			if (n.getIzdo() != null) {
				insertar(n.getIzdo(),i,e);
			}else{
				n.setIzdo(new NodoArbol(i,e));
			}
		}else{
			if (n.getDcho() != null) {
				insertar(n.getDcho(),i,e);
			}else{
				n.setDcho(new NodoArbol(i,e));
			}
		
	}

	}}

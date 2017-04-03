package package2;

public class ArbolBinario {
	protected Nodo raiz;

	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo raizArbol() {
		return raiz;
	}

	// Comprueba el estatus del árbol
	boolean esVacio() {
		return raiz == null;
	}

	public static Nodo nuevoArbol(Nodo ramaIzqda, int dato, Nodo ramaDrcha) {
		return new Nodo(ramaIzqda, dato, ramaDrcha);
	}
	
	public static int contarHojas(Nodo r){
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
	public void insertar(Nodo n,int i){
		if (n == null){
			raiz=new Nodo(i);
			
		}else if (n.getDato()>i){
			if (n.getIzdo() != null) {
				insertar(n.getIzdo(),i);
			}else{
				n.setIzdo(new Nodo(i));
			}
		}else{
			if (n.getDcho() != null) {
				insertar(n.getDcho(),i);
			}else{
				n.setDcho(new Nodo(i));
			}
		
	}

	}}

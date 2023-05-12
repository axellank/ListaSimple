package src.iccxd;

import java.util.NoSuchElementException;

public class Lista implements Lista1{

    /* Atributos de la lista */
    private Nodo cabeza, cola;
    private int longitud;

    // Constructor por Omision
    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.longitud = 0;
    }
    
    public Lista(Nodo cabeza) {

        this.cabeza = cabeza;
        this.cola = cabeza;
        this.longitud = 1;
    }

    public Lista(Nodo cola, Nodo cabeza) {
        this.cola = cola;
        this.cabeza = cabeza;
        this.longitud = 2;
    }

	@Override
	public void insertarCabeza(Nodo elemento) {
		Nodo nodo = new Nodo(elemento.getElemento());
        if (longitud == 0) {
            cabeza = nodo;
            cola = nodo;
        } else {
            nodo.setSiguiente(cabeza);            
            cabeza = nodo;
        }
        longitud++;
	}

	@Override
	public void insertarCola(Nodo elemento) {
		Nodo nodo = new Nodo(elemento.getElemento());
        if (longitud == 0) {
            cabeza = nodo;
            cola = nodo;
        } else {
            cola.setSiguiente(nodo);
            cola = nodo;
        }
        longitud++;
	}

	@Override
	public void eliminarElemento(Nodo elemento) {
		Nodo actual = cabeza;
		while (actual != null) {
			if (actual.getElemento() == elemento.getElemento()) {
				if (actual == cabeza) {
					cabeza = actual.getSiguiente();
					if (cabeza == null) {
						cola = null;
					}
				} else {
					Nodo anterior = cabeza;
					while (anterior.getSiguiente() != actual) {
						anterior = anterior.getSiguiente();
					}
					anterior.setSiguiente(actual.getSiguiente());
					if (actual.getSiguiente() == null) {
						cola = anterior;
					}
				}
				longitud--;
				return;
			}
			actual = actual.getSiguiente();
		}
		try {
			throw new NoSuchElementException();
		} catch (NoSuchElementException e) {
			System.out.println("El elemento no se encuentra en la lista.");
		}
	}
	
	@Override
	public Nodo buscarElemento(Nodo elemento) {
		Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getElemento()==(elemento.getElemento())) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("No se encontro el elemento");
        return null;
	}

	@Override
	public void imprimirLista() {
	    Nodo actual = cabeza;
	    while (actual != null) {
	        System.out.print(actual.getElemento() + " ");
	        actual = actual.getSiguiente();
	    }
	    System.out.println();
	}

	@Override
	public boolean esVacia() {
	    return longitud == 0;
	}
}

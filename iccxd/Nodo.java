package iccxd;

public class Nodo {
	/* Referencias a los nodos anterior y siguiente */
    public Nodo anterior, siguiente;
    /* El elemento que almacena un nodo */
    public int elemento;

    /* Unico constructor de la clase */
    public Nodo(int elemento) {

        this.elemento = elemento;
        this.anterior = getAnterior();
        this.siguiente = getSiguiente();
    }

    public boolean equals(Nodo n) {    	        
        if (this.elemento == n.getElemento()) {
            return true;
        }
        return false;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getElemento() {
        return elemento;
    }

    @Override
    public String toString() {
        return String.valueOf(this.elemento);
    }
}

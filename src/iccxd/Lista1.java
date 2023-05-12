package iccxd;

public interface Lista1 {
	
	/**
	 * Metodo que inserta un Nodo en la cabeza de la lista. 
	 * @param elemento de tipo Nodo
	 */
	public void insertarCabeza (Nodo elemento);
	
	/**
	 * Metodo que inserta un Nodo en la cola de la lista. 
	 * @param elemento de tipo Nodo
	 */
	public void insertarCola (Nodo elemento);
	
	/**
	 * Metodo que elimina un elemento de la lista cualquiera. 
	 * @param elemento de tipo Nodo
	 */
	public void eliminarElemento (Nodo elemento);
	
	/**
	 * Busca un elemento de tipo Nodo en toda la lista, de no ser encontrado regresa un null. 
	 * @param elemento de tipo Nodo
	 * @return nodo si es encontrado, en otro caso retorna un null
	 */
	public Nodo buscarElemento (Nodo elemento);
	
	/**
	 * Imprime los elementos del Nodo de toda la lista. 
	 */
	public void imprimirLista();
	
	/**
	 * Verifica si la lista es vacia.
	 * @return true si es vacia, en otro caso false
	 */
	public boolean esVacia();
	
}
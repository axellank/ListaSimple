import iccxd.Lista;
import iccxd.Nodo;

public class Main{
public static void main(String[] args) {
    Lista lista = new Lista();
    Nodo nodo1 = new Nodo(1);
    Nodo nodo2 = new Nodo(2);
    Nodo nodo3 = new Nodo(3);

    // Insertar elementos en la cabeza de la lista
    lista.insertarCabeza(nodo1);
    lista.insertarCabeza(nodo2);
    lista.insertarCabeza(nodo3);

    // Imprimir lista
    System.out.print("Lista original: ");
    lista.imprimirLista();

    // Eliminar elemento de la lista
    Nodo elementoEliminar = lista.buscarElemento(nodo3);
    if (elementoEliminar != null) {
        lista.eliminarElemento(elementoEliminar);
    }

    // Imprimir lista con cambios
    System.out.print("Lista con cambios: ");
    lista.imprimirLista();
}

}
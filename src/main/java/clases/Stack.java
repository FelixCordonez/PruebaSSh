package clases;

public class Stack<T> {

    private Nodo<T> cima;
    private int tamaño;

    // El contrutor
    public Stack() {
        this.cima = null;
        this.tamaño = 0;
    }
    // metodo Push 

    public void pust(T dato) {
        // inicializamos un objeto de tipo nodo y ese es generico 
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = cima;// le damos el valor de la cima 
        cima = nuevoNodo;// se obtene el nuevo valor ingresado
        tamaño++;//El tamaño va aumentar de 1 en 1

    }

    public boolean IsEmpty() {

        return cima == null;// para saber si es 

    }

    public T peek() {
        if (IsEmpty()) {

            throw new IllegalStateException(" La pila esta llena");

        }

        return null;

    }

    public int tamaño() {

        return tamaño;

    }

    public T pop() {
        if (IsEmpty()) {

            throw new IllegalStateException(" La pila esta vacia");

        }
        T dato = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return dato;
    }

    public void mostrarelemento() {
        Nodo nodoactual = cima;

        if (nodoactual == null) {
            System.out.println(" La pila esta vacia ");

        }

        System.out.println("Los elemetos de la pila son: ");
        while (nodoactual != null) {

            System.out.println(nodoactual.dato);
            nodoactual = nodoactual.siguiente;

        }

    }

}

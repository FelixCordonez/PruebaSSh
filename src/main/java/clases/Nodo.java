
package clases;

// La T en <> Perimite ser un clase generica 
// es una clse generica <T> de cualquier datos String, double int
public class Nodo <T> {
    
    T dato; 
    Nodo<T> siguiente; 

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    
    
    
}



package com.mycompany.pilauno;

import clases.Stack;

// es como crear pilas de cualquiere tippo de datos 
public class PILAUNO {

    public static void main(String[] args) {
        // en los <> dentro se pone que tipo de dato se quiere ingresar
        Stack<String> pila = new Stack<>();
        pila.pust("hola");
        pila.pust("Jenni");
        pila.pust("Johana");
        
        pila.mostrarelemento();
    }
}

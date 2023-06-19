/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura3.tarea.en.clase.corregido.modelo;

/**
 *
 * @author jeanp
 */
public class ListaEnlazada<T> {
    private Nodo<T> primerNodo;

    public ListaEnlazada() {
        primerNodo = null;
    }
    
    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo<T> nodoActual = primerNodo;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public Nodo<T> buscar(T elemento) {
        Nodo<T> nodoActual = primerNodo;
        while (nodoActual != null) {
            if (nodoActual.getDato().equals(elemento)) {
                return nodoActual;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }

    public boolean eliminar(T elemento) {
        if (primerNodo == null) {
            return false;
        }

        if (primerNodo.getDato().equals(elemento)) {
            primerNodo = primerNodo.getSiguiente();
            return true;
        }

        Nodo<T> nodoActual = primerNodo;
        while (nodoActual.getSiguiente() != null) {
            if (nodoActual.getSiguiente().getDato().equals(elemento)) {
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                return true;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return false;
    }
}    

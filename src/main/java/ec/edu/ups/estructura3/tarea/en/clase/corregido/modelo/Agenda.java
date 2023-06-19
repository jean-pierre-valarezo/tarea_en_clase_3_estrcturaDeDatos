/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura3.tarea.en.clase.corregido.modelo;

/**
 *
 * @author jeanp
 */
public class Agenda<T> {
    private ListaEnlazada<T> contactos;

    public Agenda() {
        contactos = new ListaEnlazada<>();
    }
    
    public void agregarContacto(T nombre, T telefono) {
    Contacto<T> contacto = new Contacto<>(nombre, telefono);
    contactos.agregar((T) contacto);
}

    public Contacto<T> buscarContacto(T nombre) {
    Contacto<T> contacto = buscarContacto(nombre);
    if (contacto != null) {
        contactos.buscar((T) contacto);
        System.out.println("Contacto eliminado correctamente.");
    } else {
        System.out.println("No se encontró el contacto.");
    }
        return null;
}



    public void eliminarContacto(T nombre) {
    Contacto<T> contacto = buscarContacto(nombre);
    if (contacto != null) {
        contactos.eliminar((T) contacto);
        System.out.println("Contacto eliminado correctamente.");
    } else {
        System.out.println("No se encontró el contacto.");
    }
}

    
}

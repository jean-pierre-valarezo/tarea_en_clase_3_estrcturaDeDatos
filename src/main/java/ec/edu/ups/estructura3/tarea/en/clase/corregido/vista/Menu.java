/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura3.tarea.en.clase.corregido.vista;

import ec.edu.ups.estructura3.tarea.en.clase.corregido.modelo.Agenda;
import java.util.Scanner;

/**
 *
 * @author jeanp
 */
public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void mostrar() {
        boolean salir = false;
        Agenda<String> agenda = new Agenda<>();

        while (!salir) {
            System.out.println("------ MENU ------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    agenda.agregarContacto(nombre, telefono);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    nombre = scanner.nextLine();
                    agenda.buscarContacto(nombre);
                    System.out.println("Contacto Buscado correctamente");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    nombre = scanner.nextLine();
                    agenda.eliminarContacto(nombre);
                    System.out.println("Contacto eliminado correctamente");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }
}

package main;

import java.util.Scanner;

import ups.edu.ec.clases.Carrito;
import ups.edu.ec.clases.Producto;
import ups.edu.ec.clases.Usuario;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        // Inicialización de variables
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Creación de instancias de las clases Producto y Usuario
        Producto producto = new Producto();
        Usuario usuario = new Usuario();
        Carrito carrito=new  Carrito();
        // Ingreso de productos y usuarios predefinidos
        Producto.ingresarProductos();
        Usuario.ingresarUsuarios();

        // Solicitar registro al inicio
        
        System.out.println("=== Bienvenido ===");
        System.out.println("Ingrese El nombre del Usuario: ");
        String textoBusqueda = scanner.next();
        Usuario.busquedaUsuario(textoBusqueda, Usuario.getListaUsuarios());

        do {
            // Menú principal
            System.out.println("Menú:");
            System.out.println("1. Buscar productos ");
            System.out.println("2. Mostrar carrito ");
            System.out.println("3. Comprar y salir ");
            System.out.print("Selecciona una opción: ");

            // Leer la opción del usuario
            choice = scanner.nextInt();
            scanner.nextLine();

            // Realizar acciones según la opción seleccionada
            switch (choice) {
                case 1:
                    // Búsqueda y agregación de productos al carrito
                    System.out.println("=== Buscar Productos ===");
                    System.out.print("Ingresa el nombre del producto a buscar: ");
                    String textoBusqueda2 = scanner.nextLine();
                    Carrito.agregarAlCarritoPorNombre(textoBusqueda2, Carrito.getCarrito());
                    break;
                case 2:
                    // Mostrar productos en el carrito
                    System.out.println("Mostrar Carrito");
                    Carrito.mostrarCarrito();
                    break;
                case 3:
                    // Calcular y mostrar el total del carrito antes de salir
                    double totalCarrito = Carrito.calcularTotalCarrito();
                    System.out.println("Total del carrito: $" + totalCarrito);
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (choice != 3);

        // Cerrar el scanner al salir
        scanner.close();
    }
}

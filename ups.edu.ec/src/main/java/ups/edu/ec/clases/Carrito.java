package ups.edu.ec.clases;

import java.util.ArrayList;

import java.util.ArrayList;

public class Carrito extends Producto {

    protected static ArrayList<Producto> carrito = new ArrayList<>();

    public static ArrayList<Producto> getCarrito() {
        return carrito;
    }

    // Método para agregar productos al carrito por nombre
    public static void agregarAlCarritoPorNombre(String nombreProducto, ArrayList<Producto> carrito) {
        for (Producto producto : listadoProductos) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                carrito.add(producto);
                System.out.println("Producto agregado al carrito: " + producto.getNombreProducto());
                return;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
    }

    // Método para mostrar los productos en el carrito
    public static void mostrarCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : carrito) {
                System.out.println(producto);
            }
        }
    }

    // Método para calcular el total de precios de los productos en el carrito
    public static double calcularTotalCarrito() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrito [getNombreProducto()=" + getNombreProducto() + ", getPrecio()=" + getPrecio()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}

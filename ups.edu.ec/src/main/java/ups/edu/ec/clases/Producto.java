package ups.edu.ec.clases;


import java.util.ArrayList;

import java.util.ArrayList;

public class Producto {
    // Atributos de la clase Producto
    private String nombreProducto;
    private double precio;

    // Listas estáticas compartidas entre todas las instancias de Producto
    protected static ArrayList<Producto> listadoProductos = new ArrayList<>();

    // Constructores
    public Producto() {
    }

    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    // Métodos de acceso
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para agregar productos predefinidos al listado de Productos
    public static void ingresarProductos() {
        listadoProductos.add(new Producto("Laptop Dell", 699.45));
        listadoProductos.add(new Producto("Laptop Samsung", 1020.99));
        listadoProductos.add(new Producto("Laptop Asus Gamer", 1589.99));
        listadoProductos.add(new Producto("Mouse Sony", 24.99));
        listadoProductos.add(new Producto("Teclado gamer", 89.99));
        listadoProductos.add(new Producto("Cargador Laptop Generico", 19.99));
    }

    // toString para encadenar en este caso el nombre del producto y el precio
    @Override
    public String toString() {
        return nombreProducto + ", Precio: $" + precio;
    }
}

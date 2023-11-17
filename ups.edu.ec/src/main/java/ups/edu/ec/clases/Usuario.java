package ups.edu.ec.clases;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    // Atributos de la clase Usuario
    private String nombreUsuario;

    // Lista estática que comparte con todas las instancias de la clase Usuario
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // Constructor vacío de la clase Usuario
    public Usuario() {
    }

    // Constructor con parámetro
    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Métodos de acceso a los atributos
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Método para agregar Usuarios predefinidos al listado de Usuarios
    public static void ingresarUsuarios() {
        listaUsuarios.add(new Usuario("Steven"));
        listaUsuarios.add(new Usuario("Juan"));
    }

    // Método para buscar un usuario en la lista
    public static void busquedaUsuario(String nombreUsuario, ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                System.out.println("Usuario encontrado: " + usuario.getNombreUsuario());
                return;
            }
        }
        System.out.println("Usuario no encontrado: " + nombreUsuario);
    }

    // Método para agregar un nuevo usuario solicitando entrada desde el teclado
    public void agregarUsuario(Scanner scanner) {
        System.out.println("=== Registro de usuario ===");
        System.out.print("Ingrese un nombre de usuario: ");
        String nombreUsuario = scanner.next();

        // Crear una nueva instancia de Usuario y agregarla a la lista
        Usuario newUsuario = new Usuario(nombreUsuario);
        listaUsuarios.add(newUsuario);
    }

    // Método para obtener la lista de usuarios
    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombreUsuario;
    }
}



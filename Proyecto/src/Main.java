import modulos.*;
import interfaces.arregloInterface;

public class Main {

    public static void main(String[] args) {
        arregloInterface manejo = new ManejadorLista();
        Administrador admin = new Administrador("Admins", "Boss@gmail.com");
        Empleado[] empleados = {
                new Empleado("Juan Pérez", "corrego1@gmail.com"),
                new Empleado("María García", "corrego2@gmail.com"),
                new Empleado("Carlos López", "corrego3@gmail.com")
        };

        admin.mostrarMenu();
        empleados[0].mostrarMenu();

        System.out.println("=== PRUEBA DE IMPLEMENTACIÓN ARREGLOS INTERFACE ===\n");

        System.out.println("1. ARREGLO ORIGINAL:");
        imprimirArreglo(empleados);

        System.out.println("\n2. ARREGLO EN REVERSA:");
        Empleado[] reversa = manejo.regresarReversa(empleados);
        imprimirArreglo(reversa);

        System.out.println("\n3. AGREGAR ELEMENTO:");
        Empleado nuevoEmpleado = new Empleado("Ana Martínez", "correo90@gmail.com");
        Empleado[] conNuevo = manejo.agregarElemento(empleados, nuevoEmpleado);
        System.out.println("Después de agregar: " + nuevoEmpleado);
        imprimirArreglo(conNuevo);

        System.out.println("\n4. BUSCAR ELEMENTO:");
        int posicionBuscar = 1;
        Empleado encontrado = manejo.buscarElemento(empleados, posicionBuscar);
        System.out.println("Empleado en posición " + posicionBuscar + ": " + encontrado);

        System.out.println("\n5. ELIMINAR ELEMENTO:");
        int posicionEliminar = 0;
        Empleado[] sinElemento = manejo.eliminarElemento(empleados, posicionEliminar);
        System.out.println("Después de eliminar posición " + posicionEliminar + ":");
        imprimirArreglo(sinElemento);

        try {
            manejo.regresarReversa(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            manejo.buscarElemento(empleados, 10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    private static void imprimirArreglo(Empleado[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("Arreglo vacío o nulo");
            return;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("  [" + i + "] " + arreglo[i]);
        }
        System.out.println("  Total elementos: " + arreglo.length);
    }
}
import interfaces.arregloInterface;
import modulos.*;

public class ManejadorLista implements arregloInterface {

    @Override
    public Empleado[] regresarReversa(Empleado[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        Empleado[] reverso = new Empleado[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            reverso[i] = arreglo[arreglo.length - 1 - i];
        }
        return reverso;
    }

    @Override
    public Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado) {
        if (arreglo == null || empleado == null) {
            throw new IllegalArgumentException("El arreglo o el empleado no pueden ser nulos.");
        }
        Empleado[] nuevo = new Empleado[arreglo.length + 1];
        System.arraycopy(arreglo, 0, nuevo, 0, arreglo.length);
        nuevo[arreglo.length] = empleado;
        return nuevo;
    }

    @Override
    public Empleado buscarElemento(Empleado[] arreglo, int posicion) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + posicion);
        }
        return arreglo[posicion];
    }

    @Override
    public Empleado[] eliminarElemento(Empleado[] arreglo, int posicion) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + posicion);
        }
        Empleado[] nuevo = new Empleado[arreglo.length - 1];
        int idx = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i != posicion) {
                nuevo[idx++] = arreglo[i];
            }
        }
        return nuevo;
    }
}
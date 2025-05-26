import java.util.Arrays;

/**
 * Clase para gestionar un conjunto de empleados.
 */
public class Empleados {
    /** Array que almacena los empleados */
    private Empleado[] lista;
    /** Número de empleados dados de alta */
    private int contador;

    /**
     * Crea una nueva gestión de empleados con una capacidad máxima.
     * @param capacidad Número máximo de empleados
     */
    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.contador = 0;
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param empleado Empleado a añadir
     */
    public void darDeAlta(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println(Mensajes.NO_MAS_EMPLEADOS);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        for (int i = 0; i < contador; i++) {
            double nuevoSalario = lista[i].getSalario() * (1 + porcentaje / 100);
            lista[i].setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por pantalla la información de todos los empleados.
     */
    public void mostrarEmpleados() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }

    /**
     * Devuelve una copia del array de empleados dados de alta.
     * @return Array de empleados
     */
    public Empleado[] getLista() {
        return Arrays.copyOf(lista, contador);
    }
}
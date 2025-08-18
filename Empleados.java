/**
 * Clase que gestiona una lista de empleados y sus operaciones.
 */
import java.util.Arrays;

public class Empleados {
    /** Array de empleados gestionados */
    Empleado[] lista;

    /**
     * Constructor de la clase Empleados.
     */
    public Empleados() {
        this.lista = new Empleado[0];
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param empleado Empleado a añadir
     */
    public void altaEmpleado(Empleado empleado) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = empleado;
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por pantalla la lista de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}

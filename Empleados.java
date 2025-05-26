/**
 * Clase para gestionar una lista de empleados y sus operaciones.
 */
public class Empleados {
    private Empleado[] lista;

    /**
     * Constructor que inicializa la lista de empleados.
     *
     * @param lista Array de empleados inicial.
     */
    public Empleados(Empleado[] lista) {
        this.lista = lista;
    }

    /**
     * Aumenta el salario de todos los empleados en la lista según un porcentaje dado.
     *
     * @param porcentaje Porcentaje de incremento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra la lista de empleados por consola.
     */
    public void mostrarLista() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}

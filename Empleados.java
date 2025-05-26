import java.util.ArrayList;

/**
 * Clase que gestiona una lista de empleados y operaciones sobre ellos.
 */
public class Empleados {
    /**
     * Lista de empleados gestionados.
     */
    private ArrayList<Empleado> lista;

    /**
     * Constructor de la clase Empleados.
     */
    public Empleados() {
        this.lista = new ArrayList<>();
    }

    /**
     * Obtiene la lista de empleados.
     * @return Lista de empleados.
     */
    public ArrayList<Empleado> getLista() {
        return lista;
    }

    /**
     * Establece la lista de empleados.
     * @param lista Nueva lista de empleados.
     */
    public void setLista(ArrayList<Empleado> lista) {
        this.lista = lista;
    }

    /**
     * Da de alta un nuevo empleado.
     * @param empleado Empleado a añadir.
     */
    public void altaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    /**
     * Muestra por pantalla el listado de empleados.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(Textos.EMP_LISTADO + " " + empleado);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalarioTodos(double porcentaje) {
        for (Empleado empleado : lista) {
            empleado.aumentarSalario(porcentaje);
        }
    }
}
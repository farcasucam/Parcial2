import java.util.ArrayList;

/**
 * Clase que gestiona una lista de empleados.
 */
public class Empleados {
    private Empleado empleado;
    private ArrayList<Empleado> empleados;

    /**
     * Obtiene la lista de empleados.
     *
     * @return ArrayList con los empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la lista de empleados.
     *
     * @param empleados Lista de empleados a establecer.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Muestra por pantalla la lista de empleados.
     * Si no hay empleados, muestra un mensaje indicándolo.
     */
    public void verEmpleados() {
        if (empleados == null || empleados.isEmpty()) {
            System.out.println(Mensajes.NO_HAY_EMPLEADOS);
            return;
        }
        
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
}
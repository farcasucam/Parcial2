/**
 * Clase para gestionar una lista de empleados.
 */
public class Empleados {
    /** Lista de empleados */
    public Empleado[] lista;

    /**
     * Crea la estructura para almacenar empleados.
     * @param cantidad Número de empleados a gestionar
     */
    public Empleados(int cantidad) {
        lista = new Empleado[cantidad];
    }

    /**
     * Da de alta un empleado en la posición indicada.
     * @param indice Índice en la lista
     * @param nombre Nombre del empleado
     * @param cargo Cargo del empleado
     * @param salario Salario del empleado
     */
    public void altaEmpleado(int indice, String nombre, String cargo, double salario) {
        lista[indice] = new Empleado(nombre, cargo, salario);
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
     * Muestra la lista de empleados por pantalla.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
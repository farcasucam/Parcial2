/**
 * Clase principal que gestiona la ejecución del sistema de empleados.
 */
public class SistemaGestionEmpleados {
    /**
     * Método principal.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        // Dar de alta empleados (debe usarse el método de la clase Empleados)
        empleados.altaEmpleado(new Empleado("Ana", 2000));
        empleados.altaEmpleado(new Empleado("Luis", 2500));
        empleados.altaEmpleado(new Empleado("Marta", 1800));

        // Mostrar empleados
        System.out.println(Textos.MSG_LISTADO);
        empleados.mostrarEmpleados();

        // Aumentar salario a todos un 10%
        empleados.aumentarSalarioTodos(10);

        // Mostrar empleados tras aumento de salario
        System.out.println("\n" + Textos.MSG_LISTADO_AUMENTO);
        empleados.mostrarEmpleados();
    }
}
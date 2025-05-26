import java.util.Scanner;

/**
 * Clase principal que contiene el método main para gestionar empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal que ejecuta la aplicación de gestión de empleados.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);

        empleados.darAltaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darAltaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.darAltaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        empleados.mostrarEmpleados();

        scanner.close();
    }
}
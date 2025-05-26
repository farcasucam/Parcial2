import java.util.Scanner;

/**
 * Clase principal de la aplicación de gestión de empleados.
 */
public class SistemaGestionEmpleados {
    /**
     * Método principal.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.altaEmpleado(0, "Juan", "Desarrollador", 50000);
        empleados.altaEmpleado(1, "María", "Diseñadora", 45000);
        empleados.altaEmpleado(2, "Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Mensajes.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
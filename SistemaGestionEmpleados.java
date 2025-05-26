import java.util.Scanner;

/**
 * Clase principal de la aplicación de gestión de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal. Permite dar de alta empleados, aumentar su salario y mostrar la lista.
     * @param args Argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.darDeAlta(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darDeAlta(new Empleado("María", "Diseñadora", 45000));
        empleados.darDeAlta(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUCE_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Mensajes.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}

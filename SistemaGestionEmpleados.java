import java.util.Scanner;

public class SistemaGestionEmpleados {
      private static final char[] INTRODUCIR_PORCENTAJE = null;
      private static final char[] LISTA_EMPLEADOS = null;

      public static void main(String[] args) {
        Empleados empleados = new Empleados(); // Capacidad máxima de empleados

        // Dar de alta empleados de ejemplo
        empleados.darDeAltaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darDeAltaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.darDeAltaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(INTRODUCIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(LISTA_EMPLEADOS);
        empleados.getEmpleados();

        scanner.close();
    }
}


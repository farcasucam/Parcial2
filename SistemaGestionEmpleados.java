import java.util.Scanner;

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.altaEmpleado(0, "Juan", "Desarrollador", 50000);
        empleados.altaEmpleado(1, "María", "Diseñadora", 45000);
        empleados.altaEmpleado(2, "Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarLista();

        scanner.close();
    }
}
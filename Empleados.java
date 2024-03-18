import java.util.Scanner;

public class Empleados {
    private static Empleado[] empleados;

    public void empleadosFicticios() {
        empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        Empleados.aumentarSalario(porcentaje);

        Empleados.mostrarEmpleados();
    }

    public static void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
    public static void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}

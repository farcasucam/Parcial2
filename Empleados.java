import java.util.Scanner;

/**
 * Esta clase representa una colección de empleados.
 */
public class Empleados {
    private static Empleado[] empleados;

    /**
     * Genera empleados ficticios y realiza operaciones sobre ellos.
     */
    public void empleadosFicticios() {
        empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente");

        Scanner scanner = new Scanner(System.in);
        System.out.println(Textos.introduzcaSalario);
        double porcentaje = scanner.nextDouble();

        Empleados.aumentarSalario(porcentaje);

        Empleados.mostrarEmpleados();
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje el porcentaje de aumento del salario
     */
    public static void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra la lista de empleados por consola.
     */
    public static void mostrarEmpleados() {
        System.out.println(Textos.listaEmpleados);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}

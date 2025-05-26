import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    /*
     * infresar un arrary empleado
     */
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            empleado.aumentarSalario(porcentaje);
        }
    }

    public void mostrarEmpleados() {a
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos empleados desea ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Empleado[] empleados = new Empleado[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Empleado #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Puesto: ");
            String puesto = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            empleados[i] = new Empleado(nombre, puesto, salario);
        }

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);

        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        sistema.aumentarSalario(porcentaje);
        sistema.mostrarEmpleados();
 
        scanner.close();
        System.out.println();
    }
}

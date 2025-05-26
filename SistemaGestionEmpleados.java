import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
            Empleado[] listaInicial = {
            new Empleado("Juan", "Desarrollador", 50000),
            new Empleado("María", "Diseñadora", 45000),
            new Empleado("Pedro", "Gerente", 60000)
        };

        Empleados empleados = new Empleados(listaInicial);

        // Pedir al usuario el porcentaje de aumento de salario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarLista();

        scanner.close();
    }
}

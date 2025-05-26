import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    /**
     * Constructor de la clase SistemaGestionEmpleados.
     * 
     * @param empleados Array de objetos Empleado que serán gestionados por el sistema.
     */
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    /**
     * Aumenta el salario de todos los empleados en el porcentaje especificado.
     * 
     * @param porcentaje Porcentaje de aumento de salario (por ejemplo, 10 para un 10%).
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Método principal que inicia la aplicación de gestión de empleados.
     * Permite introducir un porcentaje de aumento de salario y muestra la lista de empleados.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        sistema.aumentarSalario(porcentaje);
        
        System.out.println("Lista de Empleados:");
        

        scanner.close();
    }
}
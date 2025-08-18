/**
 * Clase principal de la aplicación de gestión de empleados.
 */
// Importa la clase Scanner para leer datos desde la consola
import java.util.Scanner;

public class SistemaGestionEmpleados {
    /**
     * Método principal que ejecuta la aplicación.
     * @param args 
     */
    public static void main(String[] args) {
        // Crea una instancia de la clase Empleados para gestionar la lista
        Empleados empleados = new Empleados();
        // Da de alta un empleado llamado Juan
        empleados.altaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        // Da de alta un empleado llamado María
        empleados.altaEmpleado(new Empleado("María", "Diseñadora", 45000));
        // Da de alta un empleado llamado Pedro
        empleados.altaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Muestra el mensaje para introducir el porcentaje de aumento
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        // Lee el porcentaje introducido por el usuario
        double porcentaje = scanner.nextDouble();

        // Aumenta el salario de todos los empleados según el porcentaje
        empleados.aumentarSalario(porcentaje);
        // Muestra la lista de empleados actualizada
        empleados.mostrarEmpleados();
        // Cierra el Scanner
        scanner.close();
    }
}

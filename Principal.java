import java.util.Scanner;

public class Principal {
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
        // he realizado correcciones en el código para que funcione correctamente.
        try {
            // Simular una excepción para probar el manejo de errores
            if (porcentaje < 0) {
                throw new Exception("El porcentaje no puede ser negativo.");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        empleados[0].setSalario(empleados[0].getSalario() * (1 + porcentaje / 100));
        empleados[1].setSalario(empleados[1].getSalario() * (1 + porcentaje / 100));    
        empleados[2].setSalario(empleados[2].getSalario() * (1 + porcentaje / 100));

        // Mostrar la lista de empleados
        System.out.println("Empleados registrados:");   
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        scanner.close();
        // Mostrar información de cada empleado
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }   
        System.out.println("Salarios actualizados.");
        System.out.println("Fin del programa.");    
        


}
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Empleado e1 = new Empleado("Juan", "Desarrollador", 50000);
        Empleado e2 = new Empleado("María", "Diseñadora", 45000);
        Empleado e3 = new Empleado("Pedro", "Gerente", 60000);

        Empleados lista1 = new Empleados(3);

        lista1.altaEmpleados(e1, 0);
        lista1.altaEmpleados(e2, 1);
        lista1.altaEmpleados(e3, 2);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.AUMENTAR_SUELDO);
        double porcentaje = scanner.nextDouble();
        lista1.aumentarSalario(porcentaje);

        System.out.println(Textos.MOSTRAR_EMPLEADOS);
        lista1.mostrarEmpleados();

        scanner.close();
    }

    /**
     * Clase que contiene los textos utilizados en la aplicación.
     * Esta clase es útil para centralizar los mensajes y facilitar su modificación.
     */
    public static class Textos
    {
        public final static String AUMENTAR_SUELDO = "Introduzca el porcentaje de aumento de salario: ";
        public final static String MOSTRAR_EMPLEADOS = "Lista de Empleados:";
    }
}
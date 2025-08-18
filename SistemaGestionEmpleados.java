import java.util.Scanner;
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);
        // Modificamos la variable sistema cambiando el nombre de la variable por Empleados ya que hemos creado una nueva clase
        Empleados sistema = new Empleados();
        // Creamos una variale para almacenar los textos
        TextosFijos textos=  new TextosFijos();
        Scanner scanner = new Scanner(System.in);
        //Sustituimos texto por variable
        System.out.print(textos.getPorcentaje());
        double porcentaje = scanner.nextDouble();
        sistema.aumentarSalario(porcentaje);
        //Sustituimos texto por variable
        System.out.println(textos.getLista());
        // Invocamos el metodo de mostrarEmpleados
        sistema.mostrarEmpleados();

        scanner.close();
    }

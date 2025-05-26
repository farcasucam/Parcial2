import java.util.Scanner;

class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    
    /*.
     *constructor para ingresar parametros ala clase empleado
     */
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    /*
     * metodo para ingresar un doble porcentaje 
     */
    public void aumentarSalario(double porcentaje) {
        this.salario *= (1 + porcentaje / 100);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario;
    }
}

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

    public void mostrarEmpleados() {
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

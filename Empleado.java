import java.util.Scanner;

class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return Mensajes.EMPLEADO_FORMATO.format(nombre, cargo, salario);
    }
}

class Empleados {
    private Empleado[] lista;

    public Empleados(int cantidad) {
        lista = new Empleado[cantidad];
    }

    public void altaEmpleado(int indice, String nombre, String cargo, double salario) {
        if (indice >= 0 && indice < lista.length) {
            lista[indice] = new Empleado(nombre, cargo, salario);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    public void mostrarLista() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }
}

class Mensajes {
    public static final String INTRODUCIR_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";
    public static final String LISTA_EMPLEADOS = "Lista de Empleados:";
    public static final String EMPLEADO_FORMATO = "Empleado{nombre='%s', cargo='%s', salario=%.2f}";
}
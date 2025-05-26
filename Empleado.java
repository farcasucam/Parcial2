import java.util.Scanner;

/**
 * Representa a un empleado con nombre, cargo y salario.
 */
class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     *
     * @param cargo Nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario del empleado.
     *
     * @return Salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     *
     * @param salario Nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return Mensajes.EMPLEADO_FORMATO.format(nombre, cargo, salario);
    }
}

/**
 * Clase que gestiona la lista de empleados.
 */
class Empleados {
    private Empleado[] lista;

    /**
     * Constructor de la clase Empleados.
     *
     * @param cantidad Número de empleados a gestionar.
     */
    public Empleados(int cantidad) {
        lista = new Empleado[cantidad];
    }

    /**
     * Registra un nuevo empleado en la lista.
     *
     * @param indice Posición del empleado en la lista.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public void altaEmpleado(int indice, String nombre, String cargo, double salario) {
        if (indice >= 0 && indice < lista.length) {
            lista[indice] = new Empleado(nombre, cargo, salario);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en la lista por un porcentaje dado.
     *
     * @param porcentaje Porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    /**
     * Muestra la lista de empleados en la consola.
     */
    public void mostrarLista() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }
}

/**
 * Clase que centraliza los mensajes fijos del sistema.
 */
class Mensajes {
    /** Mensaje para solicitar el porcentaje de aumento. */
    public static final String INTRODUCIR_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";

    /** Mensaje para mostrar la lista de empleados. */
    public static final String LISTA_EMPLEADOS = "Lista de Empleados:";

    /** Formato para mostrar información de un empleado. */
    public static final String EMPLEADO_FORMATO = "Empleado{nombre='%s', cargo='%s', salario=%.2f}";
}
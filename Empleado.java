/**
 * Representa un empleado con nombre, cargo y salario.
 */
public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    /**
     * Constructor para crear un empleado.
     *
     * @param nombre Nombre del empleado.
     * @param cargo Cargo que ocupa el empleado.
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
     * Obtiene el cargo del empleado.
     *
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
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
     * Modifica el nombre del empleado.
     *
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el cargo del empleado.
     *
     * @param cargo Nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Modifica el salario del empleado.
     *
     * @param salario Nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Devuelve una representación en cadena del empleado.
     *
     * @return Información del empleado en formato texto.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}

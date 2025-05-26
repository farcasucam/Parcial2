/**
 * Clase que representa a un empleado con nombre y salario.
 */
public class Empleado {
    /**
     * Nombre del empleado.
     */
    private String nombre;

    /**
     * Salario del empleado.
     */
    private double salario;

    /**
     * Constructor para crear un empleado.
     * @param nombre Nombre del empleado.
     * @param salario Salario del empleado.
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre Nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el salario del empleado.
     * @return Salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * @param salario Salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Aumenta el salario en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100.0;
    }

    /**
     * Representación en cadena del empleado.
     * @return Cadena con nombre y salario.
     */
    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', salario=" + salario + "}";
    }
}
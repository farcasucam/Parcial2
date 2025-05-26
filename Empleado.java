/**
 * Representa un empleado de la empresa.
 */
class Empleado {
    /** Nombre del empleado */
    private String nombre;
    /** Cargo del empleado */
    private String cargo;
    /** Salario del empleado */
    private double salario;

    /**
     * Crea un nuevo empleado.
     * @param nombre Nombre del empleado
     * @param cargo Cargo del empleado
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /** @return el nombre del empleado */
    public String getNombre() { return nombre; }
    /** @param nombre el nuevo nombre */
    public void setNombre(String nombre) { this.nombre = nombre; }
    /** @return el cargo del empleado */
    public String getCargo() { return cargo; }
    /** @param cargo el nuevo cargo */
    public void setCargo(String cargo) { this.cargo = cargo; }
    /** @return el salario del empleado */
    public double getSalario() { return salario; }
    /** @param salario el nuevo salario */
    public void setSalario(double salario) { this.salario = salario; }

    /**
     * Devuelve una representación en texto del empleado.
     * @return String con los datos del empleado
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
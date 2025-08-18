// Clase que representa a un empleado
class Empleado {
    // Nombre del empleado
    private String nombre;
    // Cargo del empleado
    private String cargo;
    // Salario del empleado
    private double salario;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre; // Asigna el nombre
        this.cargo = cargo;   // Asigna el cargo
        this.salario = salario; // Asigna el salario
    }

    // Devuelve el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve el cargo del empleado
    public String getCargo() {
        return cargo;
    }

    // Establece el cargo del empleado
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Devuelve el salario del empleado
    public double getSalario() {
        return salario;
    }

    // Establece el salario del empleado
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Devuelve una representación en texto del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' + // Muestra el nombre
                ", cargo='" + cargo + '\'' + // Muestra el cargo
                ", salario=" + salario +       // Muestra el salario
                '}';
    }
}

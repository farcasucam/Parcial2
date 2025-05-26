class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    Arraylist<Empleado> empleados;  

    // Constructor
    public Empleado() {
        this.nombre = "";
        this.cargo = "";
        this.salario = 0.0;
    }

    Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static Empleado crearEmpleado(String nombre, String cargo, double salario) {
        return new Empleado(nombre, cargo, salario);
    }

    public void aumentarSalario(double porcentaje) {
        this.salario *= (1 + porcentaje / 100);
    }   
   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';

    }

    // se ha crado los getters y setters para acceder a los atributos privados, hecho el arraylist de empleados y el constructor por defecto
}

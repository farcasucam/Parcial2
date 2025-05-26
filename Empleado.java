class Empleado {
    public static double getSalario;
    // Atributos de la clase Empleado
    // nombre, cargo y salario(todos privados)
    private String nombre;
    private String cargo;
    private static double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
    //métodos setter para modificar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Métodos getter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public static double getSalario() {
        try {
            return salario;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return getSalario;
    }
}

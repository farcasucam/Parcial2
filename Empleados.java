public class Empleados {
    // Creamos una nueva clase empleados
    private Empleado[] empleados;

    public void SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            // Modificamos las variables utilizando get y set para su uso
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
    // Creamos el metodo mostrarEmpleados en esta clase y lo invocamos en el main 
    public void mostrarEmpleados(){
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}

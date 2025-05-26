public class Empleados {
    
    private Empleado[] empleados;

    //getters y setters
    public Empleado[] getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    //dar de alta a un empleado
    public void darDeAltaEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                return;
            }
        }
        System.out.println("No se puede dar de alta al empleado, el array está lleno.");
    }
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = 0;
            try {
                nuevoSalario = Empleado.getSalario() * (1 + porcentaje / 100);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Empleado.getSalario = nuevoSalario;
        }
    }
}
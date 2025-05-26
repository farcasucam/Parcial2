import java.util.ArrayList;

public class Empleados {
    public ArrayList<Empleado> lista;

    public Empleados() {
        lista = new ArrayList<>();
    }

    // Método para dar de alta un empleado
    public void darDeAltaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    // Método para mostrar el listado de empleados
    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

    // Método para aumentar el salario de un empleado por nombre
    public boolean aumentarSalario(String nombre, double aumento) {
        for (Empleado e : lista) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                e.setSalario(e.getSalario() + aumento);
                return true;
            }
        }
        return false;
    }
}
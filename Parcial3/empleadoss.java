import java.util.ArrayList;

public class empleadoss {
    ArrayList<Empleado> empleados;
    public empleadoss() {
        empleados = new ArrayList<>();
    }

        public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            nuevoSalario = empleado.getSalario();
        }
    }
    
}

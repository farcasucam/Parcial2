public class Empleados {
    
    private Empleado[] lista;

    public Empleados(Empleado[] lista) {
        this.lista = lista;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarLista() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}


public class Empleados {
    private Empleado[] lista;
    private int contador;

    public Empleados(int tamaño) {
        this.lista = new Empleado[tamaño];
        this.contador = 0;
    }

    public void altaEmpleado(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println("No se pueden agregar más empleados, lista llena.");
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }

    // Getter para lista, si se necesita acceder desde fuera
    public Empleado[] getLista() {
        return lista;
    }
}


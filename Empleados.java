public class Empleados {
    public Empleado[] lista;
    private int contador;

    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.contador = 0;
    }

    public void altaEmpleado(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador++] = empleado;
        } else {
            System.out.println("No se pueden añadir más empleados.");
        }
    }

    public void aumentarSalario(double porcentaje) {

        double aumento = (1 + porcentaje / 100);

        
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.salario * aumento;
                empleado.salario = nuevoSalario;
            }
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }
}

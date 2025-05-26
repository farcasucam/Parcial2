import java.util.Arrays;

public class Empleados {
    private Empleado[] lista;
    private int contador;

    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.contador = 0;
    }

    public void darDeAlta(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println("No se pueden añadir más empleados.");
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (int i = 0; i < contador; i++) {
            double nuevoSalario = lista[i].getSalario() * (1 + porcentaje / 100);
            lista[i].setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }

    public Empleado[] getLista() {
        return Arrays.copyOf(lista, contador);
    }
}
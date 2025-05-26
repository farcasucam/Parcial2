import java.util.Scanner;

class SistemaGestionEmpleados {
    private String nombre;
    private String puesto;
    private double salario;

    public SistemaGestionEmpleados(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario;
    }
}
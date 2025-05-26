class Empleados 
{
    private Empleado[] lista;


    public Empleados(int lista) 
    {
        this.lista = new Empleado[3];
    }

    public Empleado[] getLista() 
    {
        return lista;
    }

    public void setLista(Empleado[] lista) 
    {
        this.lista = lista;
    }

    // Método para aumentar el salario de todos los empleados
    public void aumentarSalario(double porcentaje) 
    {
        for (Empleado empleado : lista) 
        {
            if (empleado != null) 
            {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    // Método para obtener un empleado por su nombre
    public void mostrarEmpleados()
    {
        for (Empleado empleado : lista) 
        {
            if (empleado != null) 
            {
                System.out.println(empleado.getNombre() + "\n");
            }
        }
    }

    // Método para dar de alta un empleado en una posición específica
    public void altaEmpleados(Empleado empleado, int posicion)
    {
        if (posicion >= 0 && posicion < lista.length) 
        {
            lista[posicion] = empleado;
        }
    }
}
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

    /**
     * @param porcentaje
     * Método para aumentar el salario de todos los empleados en un porcentaje dado.
     * Este método recorre la lista de empleados y actualiza el salario de cada uno.
     */
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

    /**
     * Método para mostrar los nombres de todos los empleados.
     * Este método recorre la lista de empleados y muestra el nombre de cada uno.
     */
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

    /**
     * 
     * @param empleado
     * @param posicion
     * Método para dar de alta un empleado en una posición específica de la lista.
     * Este método verifica que la posición esté dentro del rango de la lista antes de asignar el empleado.
     */
    public void altaEmpleados(Empleado empleado, int posicion)
    {
        if (posicion >= 0 && posicion < lista.length) 
        {
            lista[posicion] = empleado;
        }
    }
}
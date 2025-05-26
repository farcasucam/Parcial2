public class TextosFijos {
    private String porcentaje;
    private String lista;
    public TextosFijos() {
        this.porcentaje = "Introduzca el porcentaje de aumento de salario: ";
        this.lista = "Lista de Empleados:";
    }
    public String getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    public String getLista() {
        return lista;
    }
    public void setLista(String lista) {
        this.lista = lista;
    }
    
}

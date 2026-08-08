public class Empleado_Ej3 {
    private String nombre;
    private String departamento;
    private double precio;

    public Empleado_Ej3(String nombre, String departamento, double precio) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println(nombre + " " + departamento + " " + precio);
    }
}

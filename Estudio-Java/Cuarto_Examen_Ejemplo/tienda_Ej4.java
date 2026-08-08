public class tienda_Ej4 {
    private String nombre;
    private String ciudad;
    private double ventasAnuales;

    public tienda_Ej4(String nombre, String ciudad, double ventasAnuales) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.ventasAnuales = ventasAnuales;
    }

    public String setNombre() {
        return nombre;
    }

    public String setCiudad() {
        return ciudad;
    }

    public double ventasAnuales() {
        return ventasAnuales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setVentasAnuales(double ventasAnules) {
        this.ventasAnuales = ventasAnuales;
    }

    public void AplicarBonus(double porcentaje) {
        ventasAnuales += ventasAnuales * porcentaje / 100;
    }

    @Override
    public String toString() {
        return "Tienda: " + nombre + " Ciudad: " + ciudad + " Total de ventas: " + ventasAnuales;
    }
}

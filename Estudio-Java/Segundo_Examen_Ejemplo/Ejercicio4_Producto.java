package Segundo_Examen_Ejemplo;

public class Ejercicio4_Producto {
    private String nombre;
    private double precio;

    public Ejercicio4_Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Precio: " + precio + " Nombre: " + nombre;
    }

    public void aplicarDescuento(double pct) {
        precio = precio - (precio * pct / 100);
    }
}
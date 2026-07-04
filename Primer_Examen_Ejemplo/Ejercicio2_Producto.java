public class Ejercicio2_Producto {
    String nombre;
    double precio;

    public Ejercicio2_Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void Mostrar() {
        System.out.println("Nombre del producto: " + nombre + " Precio del producto " + precio);
    }
}

package Segundo_Examen_Ejemplo;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4_Producto p = new Ejercicio4_Producto("Cuaderno", 3.50);
        p.aplicarDescuento(10);
        System.out.println(p);
    }
}

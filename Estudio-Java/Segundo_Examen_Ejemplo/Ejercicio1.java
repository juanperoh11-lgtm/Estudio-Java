package Segundo_Examen_Ejemplo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        int producto = sc.nextInt();
        double productoIva = producto + (producto * 0.21);
        System.out.println(productoIva);
    }
}
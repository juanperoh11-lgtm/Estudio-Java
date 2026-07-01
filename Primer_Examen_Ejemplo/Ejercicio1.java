import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Introudce el precio del producto");
		double precio = sc.nextDouble();
		System.out.println("Introduce un numero de unidades");
		int unidad = sc.nextInt();

		double precioIva = unidad * precio;
		System.out.println(precioIva);
    }
}
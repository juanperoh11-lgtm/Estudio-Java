import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        ArrayList<Ejercicio4> listaLibros = new ArrayList<>();

        // ? Datos de ejemplo usando el constructor de Ejercicio4
        listaLibros.add(new Ejercicio4("Cien años de soledad", "Gabriel García Márquez", "978-0307474728", 1967,
                "Disponible", "1ª Edición"));
        listaLibros.add(new Ejercicio4("El amor en los tiempos del cólera", "Gabriel García Márquez", "978-0307389732",
                1985, "Prestado", "2ª Edición"));
        listaLibros.add(new Ejercicio4("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424116088", 1605,
                "Disponible", "Edición Especial"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del autor a buscar: ");
        String autorBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (Ejercicio4 libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(autorBuscado)) {
                System.out.println(libro.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se han encontrado libros de " + autorBuscado);
        }
        scanner.close();
    }
}
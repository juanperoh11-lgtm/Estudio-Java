import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Ejercicio4> listaLibros = new ArrayList<>();

        //? Ejemplo de datos añadidios
        listaLibros.add(new Ejercicio4("Cien años de soledad", "Gabriel García Márquez", "978-0307474728", 1967,
                "Disponible", "1ª Edición"));
        listaLibros.add(new Ejercicio4("El amor en los tiempos del cólera", "Gabriel García Márquez", "978-0307389732",
                1985, "Prestado", "2ª Edición"));
        listaLibros.add(new Ejercicio4("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424116088", 1605,
                "Disponible", "Edición Especial"));

        HashMap<String, Ejercicio4> mapaLibros = new HashMap<>();

        for (Ejercicio4 libro : listaLibros) {
            mapaLibros.put(libro.getIsbn(), libro);
        }

        buscarPorIsbn(mapaLibros, "978-8424116088");
    }

    public static void buscarPorIsbn(HashMap<String, Ejercicio4> mapa, String isbn) {
        if (mapa.containsKey(isbn)) {
            System.out.println(mapa.get(isbn).toString());
        } else {
            System.out.println("No se encontró el libro con el ISBN indicado.");
        }
    }
}

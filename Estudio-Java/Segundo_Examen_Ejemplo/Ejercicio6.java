import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("Pedro");
        nombres.add("Alba");
        nombres.add("luis");

        // 1. Corrección: Usamos '<' para evitar IndexOutOfBoundsException
        for (int i = 0; i < nombres.size(); i++) {
            String n = nombres.get(i);

            // 2. Corrección: Usamos comillas simples 'A' para el tipo char
            // y toUpperCase() para capturar tanto 'a' como 'A'
            if (Character.toUpperCase(n.charAt(0)) == 'A') {
                System.out.println(n.toUpperCase());
            }
        }
    }
}

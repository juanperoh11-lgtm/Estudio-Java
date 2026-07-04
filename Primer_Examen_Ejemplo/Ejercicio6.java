import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pepe");
        nombres.add("Ana");
        nombres.add("Carlos");

        int cont = 0;
        // Todo 1. Corregido: Se cambia el "<=" por "<" para evitar salir del rango de
        // la lista
        for (int i = 0; i < nombres.size(); i++) {
            // Todo 2. Corregido: Se usa .equals() para comparar el contenido de los Strings
            if (nombres.get(i).equals("Ana")) {
                cont++;
            }
        }
        System.out.println("Ana aparece " + cont + " veces");
    }
}

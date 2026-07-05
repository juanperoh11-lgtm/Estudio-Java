import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pepe");
        nombres.add("Ana");
        nombres.add("Carlos");

        int cont = 0;
        for (int i = 0; i < nombres.size(); i++) {

            if (nombres.get(i).equals("Ana")) {
                cont++;
            }
        }
        System.out.println("Ana aparece " + cont + " veces");
    }
}

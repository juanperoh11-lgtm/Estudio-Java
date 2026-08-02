package Segundo_Examen_Ejemplo;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * ArrayList<String> nombres = new ArrayList<>();
         *  nombres.add("ana");
         *  nombres.add("Pedro");
         *  nombres.add("Alba");
         *  nombres.add("luis");
         *  for (int i = 0; i <= nombres.size(); i++) {
         *      String n = nombres.get(i);
         *      if (n.charAt(0) == "A") {
         *          System.out.println(n.toUpperCase());
         *      }
         *  }
         */

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
nombres.add("Pedro");
nombres.add("Alba");
nombres.add("luis");
for (int i = 0; i <= nombres.size(); i++) {
    String n = nombres.get(i);
    if (n.charAt(0) == "A") {
        System.out.println(n.toUpperCase());
   
    }
}

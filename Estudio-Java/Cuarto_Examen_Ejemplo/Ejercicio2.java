public class Ejercicio2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int cont = 0;
        while (x > 0) {
            if (x % y == 0) {
                System.out.println("Multiplo: " + x);
                cont++;
            } else {
                System.out.println("No multiplo: " + x);
            }
            x -= 2;
        }
        System.out.println("Total multiplos: " + cont);
    }
}

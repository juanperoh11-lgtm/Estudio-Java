import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    private static boolean esPrimo(int n) {
        if (n < 2)
            return false;

        for (int i = 0; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

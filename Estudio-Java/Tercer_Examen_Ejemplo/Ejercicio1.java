import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();

        if (n < 0)
            System.out.println("Introduce un numero mayor que 0");
        for (int i = 1; i <= n; i++) {
            if (esPerfecto(i)) {
                System.out.println("-> " + i);
            }
        }
    }

    public static boolean esPerfecto(int num) {
        if (num <= 1)
            return false;
        int sumaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sumaDivisores += i;
        }

        return sumaDivisores == num;

    }

}
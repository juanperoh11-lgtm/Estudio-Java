public class Ejercicio3 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                suma += i;
            } else {
                suma -= 1;
            }
            System.out.println("i=" + i + " suma=" + suma);
        }
        System.out.println("Total: " + suma);
    }
    //Todo: Sin ejecutar el codigo la solucion es 9
}

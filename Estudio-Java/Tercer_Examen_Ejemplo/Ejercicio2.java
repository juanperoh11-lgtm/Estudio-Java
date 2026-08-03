public class Ejercicio2 {
    public static void main(String[] args) {
        double [] temperaturas = {22.5, 30.5, 15.4, 24.8, 30.9};
        int diasCalurosos = 0;
        for(int i = 0; i < temperaturas.length; i ++) {
            if (temperaturas[i] > 25.0)
                diasCalurosos ++;
        }

        System.out.println("Total de días calurosos (temperatura > 25°C): " + diasCalurosos);

    }
}

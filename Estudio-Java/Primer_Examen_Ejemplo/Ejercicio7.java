public class Ejercicio7 {
    public static void main(String[] args) {
        String entrada = "hola"; // Debería ser un número

        try {

            double radioConvertido = Double.parseDouble(entrada);

            Ejercicio7_Circulo miCirculo = new Ejercicio7_Circulo(radioConvertido);
            System.out.println("El área del círculo es: " + miCirculo.area());

        } catch (NumberFormatException e) {

            System.out.println("Radio no válido");
        }
    }
}
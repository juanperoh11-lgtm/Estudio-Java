public class Ejercicio7 {
    public static void main(String[] args) {
        String entrada = "hola";
        try {
            double r = Double.parseDouble(entrada);
            Ejercicio7_Circulo c = new Ejercicio7_Circulo(r);
            System.out.println("Area: " + c.area());
        } catch (NumberFormatException e) {
            System.out.println("Radio no valido");
        }
    }
}

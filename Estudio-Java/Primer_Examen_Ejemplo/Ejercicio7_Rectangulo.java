public class Ejercicio7_Rectangulo extends Ejercicio7_Figuras {
    private double base, altura;

    public Ejercicio7_Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
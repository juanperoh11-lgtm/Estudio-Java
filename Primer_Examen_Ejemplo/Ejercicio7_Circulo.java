public class Ejercicio7_Circulo extends Ejercicio7_Figuras {
    private double radio;

    public Ejercicio7_Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}
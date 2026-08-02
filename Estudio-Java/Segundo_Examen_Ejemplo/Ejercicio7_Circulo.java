public class Ejercicio7_Circulo extends Ejercicio7_Figura {
    double radio;

    Ejercicio7_Circulo(double r) {
        this.radio = r;
    }

    double area() {
        return Math.PI * radio * radio;
    }
}
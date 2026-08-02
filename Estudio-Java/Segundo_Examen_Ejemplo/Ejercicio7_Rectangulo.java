public class Ejercicio7_Rectangulo extends Ejercicio7_Figura {
    double base, altura;

    Ejercicio7_Rectangulo(double b, double h) {
        base = b;
        altura = h;
    }

    double area() {
        return base * altura;
    }
}
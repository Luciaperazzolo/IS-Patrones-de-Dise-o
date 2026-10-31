// Rectangulo hereda de Figura.
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    // Constructor que recibe las dimensiones del rectángulo.
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementamos el método heredado de Figura.
    // Calculamos el área multiplicando la base por la altura.
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
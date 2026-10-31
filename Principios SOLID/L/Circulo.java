// Circulo también hereda de Figura.
public class Circulo extends Figura {

    private double radio;

    // Constructor que recibe el radio del círculo.
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementamos el método heredado de Figura.
    // Calculamos el área utilizando la fórmula PI * radio².
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
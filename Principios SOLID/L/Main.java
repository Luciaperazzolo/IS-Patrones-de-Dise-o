public class Main {

    // Este método recibe cualquier objeto que sea de tipo Figura.
    // No necesita conocer si es un rectángulo o un círculo.
    public static void mostrarArea(Figura figura) {
        System.out.println("Área: " + figura.calcularArea());
    }

    public static void main(String[] args) {

        // Creamos un rectángulo y lo guardamos en una variable Figura.
        Figura rectangulo = new Rectangulo(5, 3);

        // Creamos un círculo y también lo guardamos como Figura.
        Figura circulo = new Circulo(4);

        // Podemos pasar cualquiera de las dos figuras al mismo método.
        // Cada una ejecutará su propia implementación de calcularArea().
        mostrarArea(rectangulo);
        mostrarArea(circulo);
    }
}
package Builder;

public class Main {
      public static void main(String[] args) {

        Director director = new Director();

        ComputadoraBuilder builder = new ComputadoraBuilderImpl();

        Computadora computadoraGaming = director.construirComputadoraGaming(builder);

        System.out.println("Computadora Gaming:");
        System.out.println(computadoraGaming);

        System.out.println();

        Computadora computadoraOficina = director.construirComputadoraOficina(new ComputadoraBuilderImpl());

        System.out.println("Computadora de Oficina:");
        System.out.println(computadoraOficina);
    }
}

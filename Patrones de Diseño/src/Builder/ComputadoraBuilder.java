package Builder;

public interface ComputadoraBuilder {
    //Define que cosas puede configurar nuestro Builder.
    ComputadoraBuilder procesador(String procesador);

    ComputadoraBuilder ram(int ram);

    ComputadoraBuilder almacenamiento(String almacenamiento);

    ComputadoraBuilder placaVideo(String placaVideo);

    ComputadoraBuilder sistemaOperativo(String sistemaOperativo);

    ComputadoraBuilder wifi(boolean wifi);

    ComputadoraBuilder bluetooth(boolean bluetooth);

    Computadora build();
}

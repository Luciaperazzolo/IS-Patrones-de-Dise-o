package Builder;

public class ComputadoraBuilderImpl implements ComputadoraBuilder {

    private String procesador;
    private int ram;
    private String almacenamiento;
    private String placaVideo;
    private String sistemaOperativo;
    private boolean wifi;
    private boolean bluetooth;

    @Override
    public ComputadoraBuilder procesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    @Override
    public ComputadoraBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputadoraBuilder almacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    @Override
    public ComputadoraBuilder placaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    @Override
    public ComputadoraBuilder sistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        return this;
    }

    @Override
    public ComputadoraBuilder wifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    @Override
    public ComputadoraBuilder bluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    @Override
    public Computadora build() {

        return new Computadora(
            procesador,
            ram,
            almacenamiento,
            placaVideo,
            sistemaOperativo,
            wifi,
            bluetooth
        );
    }
}

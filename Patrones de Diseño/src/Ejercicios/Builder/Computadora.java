package Builder;

public class Computadora {

    //Usamos Final lo cual significa que una vez construida la computadora, sus datos no se modifican.
    private final String procesador;
    private final int ram;
    private final String almacenamiento;
    private final String placaVideo;
    private final String sistemaOperativo;
    private final boolean wifi;
    private final boolean bluetooth;

    //Constructor
    public Computadora(String procesador, int ram, String almacenamiento, String placaVideo, String sistemaOperativo, boolean wifi, boolean bluetooth) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.placaVideo = placaVideo;
        this.sistemaOperativo = sistemaOperativo;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }

    //Getters y Setters
    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    @Override
    public String toString() {
        return "Computadora{" +
            "procesador='" + procesador + '\'' +
            ", ram=" + ram + " GB" +
            ", almacenamiento='" + almacenamiento + '\'' +
            ", placaVideo='" + placaVideo + '\'' +
            ", sistemaOperativo='" + sistemaOperativo + '\'' +
            ", wifi=" + wifi +
            ", bluetooth=" + bluetooth +
        '}';
    }
}


package Conductuales.Command;

public class Dispositivo {

    // Receiver: contiene las acciones reales.

    public void encender() {
        System.out.println("El dispositivo fue encendido.");
    }

    public void apagar() {
        System.out.println("El dispositivo fue apagado.");
    }
}
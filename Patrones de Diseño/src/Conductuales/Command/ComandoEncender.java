package Conductuales.Command;

public class ComandoEncender implements Comando {

    private Dispositivo receptor;

    public ComandoEncender(Dispositivo receptor) {
        this.receptor = receptor;
    }

    @Override
    public void ejecutar() {

        // Delegamos la acción al Receiver.
        receptor.encender();
    }
}
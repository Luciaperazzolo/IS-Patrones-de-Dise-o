package Conductuales.Command;

public class ComandoApagar implements Comando {

    private Dispositivo receptor;

    public ComandoApagar(Dispositivo receptor) {
        this.receptor = receptor;
    }

    @Override
    public void ejecutar() {

        // Delegamos la acción al Receiver.
        receptor.apagar();
    }
}
    


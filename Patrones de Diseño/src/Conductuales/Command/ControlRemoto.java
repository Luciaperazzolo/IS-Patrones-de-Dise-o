package Conductuales.Command;

public class ControlRemoto {

    private Comando comando;

    // Permite asignar un comando al control.
    public void setComando(Comando comando) {
        this.comando = comando;
    }

    // Ejecuta el comando seleccionado.
    public void presionarBoton() {

        if (comando != null) {
            comando.ejecutar();
        }
    }
}
package Conductuales.Command;

public class MainCommand {

    public static void main(String[] args) {

        // Creamos el Receiver.
        Dispositivo dispositivo = new Dispositivo();

        // Creamos los comandos.
        Comando encender = new ComandoEncender(dispositivo);

        Comando apagar = new ComandoApagar(dispositivo);

        // Creamos el Invoker.
        ControlRemoto control = new ControlRemoto();

        // Ejecutamos el comando para encender.
        control.setComando(encender);
        control.presionarBoton();

        // Ejecutamos el comando para apagar.
        control.setComando(apagar);
        control.presionarBoton();
    }
}

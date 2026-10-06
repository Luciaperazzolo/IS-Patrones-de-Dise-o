package Entregables.Decorator;

/**
 * DECORATOR CONCRETO: además de lo que ya hacía el notificador envuelto,
 * envía la notificación por Slack.
 */

public class NotificadorSlack extends NotificadorDecorator {

    public NotificadorSlack(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje); // Ejecuta primero el comportamiento del Decorator padre, primero se ejecuta el objeto que está envuelto.
        System.out.println("[SLACK] " + mensaje); //Esto agrega el nuevo comportamiento: enviar también por Slack.
    }
}

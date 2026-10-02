package Entregables.Decorator;

/**
 * DECORATOR CONCRETO: además de lo que ya hacía el notificador envuelto,
 * envía la notificación por SMS.
 */

public class NotificadorSMS extends NotificadorDecorator {

    public NotificadorSMS(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje); // primero lo anterior
        System.out.println("[SMS] " + mensaje);
    }
}

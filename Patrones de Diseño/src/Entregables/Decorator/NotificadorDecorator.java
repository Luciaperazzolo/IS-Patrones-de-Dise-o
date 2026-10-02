package Entregables.Decorator;

/**
 * DECORATOR: implementa Notificador y envuelve a otro Notificador.
 * Por defecto delega el envío en el objeto envuelto; los decorators
 * concretos agregan su propio canal encima.
 */

public abstract class NotificadorDecorator implements Notificador {

    protected Notificador notificador; // el notificador envuelto

    public NotificadorDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviar(String mensaje) {
        notificador.enviar(mensaje);
    }
}

package Entregables.Decorator;

/**
 * COMPONENTE: interfaz común para cualquier forma de enviar una notificación.
 * El cliente solo conoce este tipo, sin importar por cuántos canales salga el mensaje.
 */

public interface Notificador {
    void enviar(String mensaje);
}

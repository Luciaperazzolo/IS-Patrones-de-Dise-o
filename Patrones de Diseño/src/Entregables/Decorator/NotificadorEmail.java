package Entregables.Decorator;

/**
 * COMPONENTE CONCRETO: canal base del sistema. Todo usuario recibe
 * la notificación por email; los demás canales se agregan con decorators.
 */

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[EMAIL] " + mensaje);
    }
}

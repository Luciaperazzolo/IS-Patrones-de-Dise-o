package Entregables.Decorator;

/**
 * CLIENTE: simula una tienda online que avisa del estado de un pedido.
 * Cada cliente recibe los canales que eligió, armados envolviendo
 * al email con los decorators necesarios.
 */

public class Main {

    public static void main(String[] args) {
        String mensaje = "Tu pedido #1234 fue despachado";

        System.out.println("Solo email:");
        Notificador n1 = new NotificadorEmail();
        n1.enviar(mensaje);

        System.out.println("\nEmail + SMS:");
        Notificador n2 = new NotificadorSMS(new NotificadorEmail());
        n2.enviar(mensaje);

        System.out.println("\nEmail + SMS + Slack:");
        Notificador n3 = new NotificadorSlack(new NotificadorSMS(new NotificadorEmail()));
        n3.enviar(mensaje);
    }
}

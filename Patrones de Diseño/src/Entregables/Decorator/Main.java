package Entregables.Decorator;

/**
 * CLIENTE: simula una tienda online que avisa del estado de un pedido.
 * Cada cliente recibe los canales que eligió, armados envolviendo
 * al email con los decorators necesarios.
 */

public class Main {

    public static void main(String[] args) {
        String mensaje = "Tu pedido #1234 fue despachado"; //el mensaje que vamos a enviar.

        //1er caso:
        System.out.println("Solo email:");
        Notificador n1 = new NotificadorEmail();
        n1.enviar(mensaje);

        //2do
        System.out.println("\nEmail + SMS:");
        Notificador n2 = new NotificadorSMS(new NotificadorEmail()); //primero creamor email, y luego SMS que envuelve email
        n2.enviar(mensaje);

        System.out.println("\nEmail + SMS + Slack:");
        Notificador n3 = new NotificadorSlack(new NotificadorSMS(new NotificadorEmail())); //primero creamor email, y luego SMS que envuelve email
        n3.enviar(mensaje);
    }
    //Tenemos una cadena de objetos, donde cada uno envuelve al anterior.
}

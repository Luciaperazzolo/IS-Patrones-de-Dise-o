// Esta clase también implementa Notificador.
// Se encarga de enviar notificaciones por SMS.
public class NotificadorSMS implements Notificador {

    // Implementamos el método definido en la interfaz.
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
// Esta clase implementa la interfaz Notificador.
// Se encarga específicamente de enviar notificaciones por email.
public class NotificadorEmail implements Notificador {

    // Implementamos el método definido en la interfaz.
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
// Esta clase se encarga de gestionar el envío de notificaciones.
public class ServicioNotificacion {

    // Dependemos de la interfaz Notificador y no de una clase concreta.
    private Notificador notificador;

    // Recibimos el notificador desde afuera mediante el constructor.
    // Así podemos utilizar cualquier clase que implemente Notificador.
    public ServicioNotificacion(Notificador notificador) {
        this.notificador = notificador;
    }

    // Utilizamos el notificador recibido para enviar el mensaje.
    public void enviarNotificacion(String mensaje) {
        notificador.enviar(mensaje);
    }
}
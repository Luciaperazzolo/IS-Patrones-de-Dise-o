package Creacionales.DependencyInjection;

public class ServicioNotificacion {

    private Notificador notificador;

    // La dependencia se recibe desde afuera.
    // Esto se llama inyección por constructor.
    public ServicioNotificacion(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensaje) {

        // No importa qué implementación concreta
        // de Notificador se esté utilizando.
        notificador.enviar(mensaje);
    }
}
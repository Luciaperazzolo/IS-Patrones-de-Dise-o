package Conductuales.Mediator;

public interface Mediador {
    // Registra un usuario en la sala.
    void agregarUsuario(Usuario usuario);

    // Envía un mensaje a través del mediador.
    void enviarMensaje(String mensaje, Usuario emisor);
}
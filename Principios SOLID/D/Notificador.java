// Interfaz que establece una abstracción para los notificadores.
// Cualquier clase que la implemente deberá definir cómo enviar un mensaje.
public interface Notificador {

    void enviar(String mensaje);

}
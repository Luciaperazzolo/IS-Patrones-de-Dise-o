package Conductuales.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements Mediador {
    private List<Usuario> usuarios;

    public SalaChat() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        // Agregamos el usuario a la sala.
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario emisor) {
        // Recorremos todos los usuarios registrados.
        for (Usuario usuario : usuarios) {

            // Enviamos el mensaje a todos excepto al emisor.
            if (usuario != emisor) {
                usuario.recibir(emisor.getNombre() + ": " + mensaje);
            }
        }
    }
}
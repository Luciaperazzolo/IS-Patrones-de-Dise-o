package Conductuales.Mediator;

public class Usuario {
    private String nombre;
    private Mediador mediador;

    public Usuario(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre() {
        return nombre;
    }

    // Envía un mensaje utilizando el Mediator.
    public void enviar(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);

        // Delegamos la comunicación al mediador.
        mediador.enviarMensaje(mensaje, this);
    }

    // Recibe un mensaje enviado por otro usuario.
    public void recibir(String mensaje) {
        System.out.println(nombre + " recibe de " + mensaje);
    }
}
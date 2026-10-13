package Estructurales.Bridge;

public class NotificacionReserva extends Notificacion{
    public NotificacionReserva(MedioEnvio medioEnvio) {
        super(medioEnvio);
    }

    @Override
    public void notificar(String destinatario) {
        String mensaje = "El libro que reservaste ya esta disponible.";
        medioEnvio.enviar(destinatario, mensaje);
    }
}

package Estructurales.Bridge;

public class NotificacionVencimiento extends Notificacion{
    public NotificacionVencimiento(MedioEnvio medioEnvio) {
        super(medioEnvio);
    }

    @Override
    public void notificar(String destinatario) {
        String mensaje = "Recordatorio: tu prestamo esta por vencer.";
        medioEnvio.enviar(destinatario, mensaje);
    }
}

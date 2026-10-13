package Estructurales.Bridge;

public class main {
    public static void main(String[] args) {

        MedioEnvio consola = new EnvioConsola();
        MedioEnvio email = new EnvioEmail();

        Notificacion reserva = new NotificacionReserva(consola);
        Notificacion vencimiento = new NotificacionVencimiento(email);

        reserva.notificar("Lucia");
        System.out.println();

        vencimiento.notificar("Juan");
    }
}

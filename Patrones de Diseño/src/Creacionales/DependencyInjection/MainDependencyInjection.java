package Creacionales.DependencyInjection;

public class MainDependencyInjection {

    public static void main(String[] args) {

        // Creamos una implementación concreta.
        Notificador email = new EmailNotificador();

        // Inyectamos la dependencia por constructor.
        ServicioNotificacion servicioEmail = new ServicioNotificacion(email);

        servicioEmail.notificar("Bienvenido al sistema.");

        System.out.println();

        // Creamos otra implementación.
        Notificador sms = new SMSNotificador();

        // Inyectamos una dependencia diferente.
        ServicioNotificacion servicioSMS = new ServicioNotificacion(sms);

        servicioSMS.notificar("Tu código de verificación es 1234.");
    }
}
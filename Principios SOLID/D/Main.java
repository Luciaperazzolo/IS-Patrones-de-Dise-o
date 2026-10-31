public class Main {

    public static void main(String[] args) {

        // Creamos un notificador de tipo Email.
        Notificador email = new NotificadorEmail();

        // Le pasamos el notificador al servicio mediante el constructor.
        ServicioNotificacion servicio1 =
                new ServicioNotificacion(email);

        // Enviamos una notificación por email.
        servicio1.enviarNotificacion("Hola, este es un email.");


        // Creamos un notificador de tipo SMS.
        Notificador sms = new NotificadorSMS();

        // Podemos utilizar el mismo servicio con otro tipo de notificador.
        ServicioNotificacion servicio2 =
                new ServicioNotificacion(sms);

        // Enviamos una notificación por SMS.
        servicio2.enviarNotificacion("Hola, este es un SMS.");
    }
}
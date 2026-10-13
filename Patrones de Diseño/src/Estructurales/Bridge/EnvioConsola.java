package Estructurales.Bridge;

public class EnvioConsola implements MedioEnvio{
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Notificación para " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}

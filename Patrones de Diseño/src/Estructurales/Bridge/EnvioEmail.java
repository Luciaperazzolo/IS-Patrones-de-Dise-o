package Estructurales.Bridge;

public class EnvioEmail implements MedioEnvio{
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Contenido del email: " + mensaje);
    }
}

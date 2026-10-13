package Estructurales.Bridge;

//Esta clase representa el tipo general de notificación.
public abstract class Notificacion {
    protected MedioEnvio medioEnvio; // Composición: cada notificación tiene un medio de envío asociado.
    // Constructor que recibe un medio de envío específico.
    //Esto permite decidir qué medio utilizar cuando creamos la notificación.
    public Notificacion(MedioEnvio medioEnvio) {
        this.medioEnvio = medioEnvio;
    }
    // Método abstracto que debe ser implementado por las subclases concretas de notificación.
    public abstract void notificar(String destinatario); 
}

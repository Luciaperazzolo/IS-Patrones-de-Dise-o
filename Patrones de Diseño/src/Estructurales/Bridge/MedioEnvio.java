package Estructurales.Bridge;

//Es una interfaz que define qué operación debe ofrecer cualquier medio de envío.
//No establece cómo se realiza el envío.
//Cada clase decide como implementa el metodo enviar no importa como, tienen que implementar la interfaz.
public interface MedioEnvio {
    void enviar(String destinatario, String mensaje);
}

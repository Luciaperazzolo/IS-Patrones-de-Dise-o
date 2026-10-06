package Entregables.Decorator;

/**
 * DECORATOR: implementa Notificador y envuelve a otro Notificador.
 * Por defecto delega el envío en el objeto envuelto; los decorators
 * concretos agregan su propio canal encima.
 */

public class NotificadorDecorator implements Notificador { //clase base para los Decorators concretos

    protected Notificador notificador; //Esto hace que el decorator tenga un Notificador adentro. Es el objeto envuelto.

    public NotificadorDecorator(Notificador notificador) { //Recibe el objeto a envolver y lo guarda.
        this.notificador = notificador;
    }

    @Override
    public void enviar(String mensaje) { //le pasa el mensaje al objeto que esta envolviendo
        notificador.enviar(mensaje);
    }

    //El Decorator no reemplaza necesariamente el comportamiento anterior.
    //Lo conserva y permite agregar algo antes o después. 
}

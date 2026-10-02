package Entregables.Observer;

// Observador concreto: recibe la noticia y la muestra como notificación del celular.

public class Celular implements Observador {

    public void actualizar(String noticia) {
        System.out.println("Celular recibió: " + noticia);
    }
}

package Entregables.Observer;

// Observador concreto: recibe la noticia y la muestra en la computadora.

public class Computadora implements Observador {

    public void actualizar(String noticia) {
        System.out.println("Computadora recibió: " + noticia);
    }
}

package Entregables.Observer;
import java.util.ArrayList;

// Sujeto concreto: guarda la última noticia y avisa a todos cuando cambia.

public class Noticiero implements Sujeto {

    private ArrayList<Observador> lista = new ArrayList<>();
    private String noticia;

    public void agregar(Observador o) {
        lista.add(o);
    }

    public void quitar(Observador o) {
        lista.remove(o);
    }

    public void notificar() {
        for (Observador o : lista) {
            o.actualizar(noticia);
        }
    }

    // Cuando cambia la noticia (el estado), se notifica a todos.
    public void setNoticia(String noticia) {
        this.noticia = noticia;
        notificar();
    }
}

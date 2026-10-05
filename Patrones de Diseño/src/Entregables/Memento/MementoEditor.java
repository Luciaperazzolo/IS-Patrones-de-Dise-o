package Entregables.Memento;

public class MementoEditor {

    private final String contenido;

    // Guarda una copia del estado del editor.
    public MementoEditor(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
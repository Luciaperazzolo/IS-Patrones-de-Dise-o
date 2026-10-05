package Entregables.Memento;

public class EditorTexto {

    private String contenido;

    public EditorTexto() {
        this.contenido = "";
    }

    public void escribir(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    // Crea un Memento con el estado actual.
    public MementoEditor guardar() {
        return new MementoEditor(contenido);
    }

    // Recupera el estado guardado dentro del Memento.
    public void restaurar(MementoEditor memento) {
        this.contenido = memento.getContenido();
    }
}
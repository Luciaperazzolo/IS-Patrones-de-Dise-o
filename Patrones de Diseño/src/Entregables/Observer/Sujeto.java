package Entregables.Observer;

// Interfaz del objeto que avisa: permite agregar, quitar y notificar observadores.

public interface Sujeto {
    void agregar(Observador o);
    void quitar(Observador o);
    void notificar();
}

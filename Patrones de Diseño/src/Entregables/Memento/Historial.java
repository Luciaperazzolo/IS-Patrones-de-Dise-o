package Entregables.Memento;

import java.util.Stack;

public class Historial {

    private Stack<MementoEditor> estados;

    public Historial() {
        estados = new Stack<>();
    }

    // Guarda un nuevo estado.
    public void guardar(MementoEditor memento) {
        estados.push(memento);
    }

    // Devuelve el último estado almacenado.
    public MementoEditor deshacer() {

        if (estados.isEmpty()) {
            throw new IllegalStateException(
                "No existen estados guardados."
            );
        }

        return estados.pop();
    }
}
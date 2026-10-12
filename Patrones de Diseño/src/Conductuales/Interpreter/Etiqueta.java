package Conductuales.Interpreter;

/**
 * EXPRESIÓN TERMINAL: es la unidad más simple de la regla.
 * Pregunta si el cliente tiene una etiqueta (por ejemplo, "VIP").
 */
public class Etiqueta implements Expresion {

    private String nombre;

    public Etiqueta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return contexto.tiene(nombre);
    }
}

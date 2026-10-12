package Conductuales.Interpreter;

/**
 * EXPRESIÓN NO TERMINAL: combina dos expresiones con un "O".
 * Es verdadera si al menos una de las dos lo es.
 */
public class O implements Expresion {

    private Expresion izquierda;
    private Expresion derecha;

    public O(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return izquierda.interpretar(contexto) || derecha.interpretar(contexto);
    }
}

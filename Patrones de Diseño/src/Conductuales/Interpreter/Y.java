package Conductuales.Interpreter;

/**
 * EXPRESIÓN NO TERMINAL: combina dos expresiones con un "Y".
 * Es verdadera solo si las dos lo son.
 */
public class Y implements Expresion {

    private Expresion izquierda;
    private Expresion derecha;

    public Y(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return izquierda.interpretar(contexto) && derecha.interpretar(contexto);
    }
}

package Conductuales.Interpreter;

/**
 * EXPRESIÓN ABSTRACTA: interfaz común de todas las partes de una regla.
 * Cada expresión sabe interpretarse y devolver true o false.
 */
public interface Expresion {
    boolean interpretar(Contexto contexto);
}

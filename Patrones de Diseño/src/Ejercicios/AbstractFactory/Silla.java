package AbstractFactory;

/**
 * PRODUCTO ABSTRACTO #1
 * Toda "familia" de muebles debe poder crear una Silla.
 * Esta interfaz define QUÉ hace una silla, sin importar su estilo.
 */
public interface Silla {
    void sentarse();
}

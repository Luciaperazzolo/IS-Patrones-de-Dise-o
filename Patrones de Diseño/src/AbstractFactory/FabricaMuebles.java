package AbstractFactory;

/**
 * ABSTRACT FACTORY (la interfaz clave del patrón)
 *
 * Declara un método de creación por cada producto de la familia
 * (una Silla y un Sofa), pero sin decir de qué ESTILO van a ser.
 * Eso lo decide cada fábrica concreta que implemente esta interfaz.
 */

public interface FabricaMuebles {
    Silla crearSilla();
    Sofa crearSofa();
}

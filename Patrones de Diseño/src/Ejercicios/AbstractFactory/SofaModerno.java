package AbstractFactory;

/**
 * PRODUCTO CONCRETO
 * Implementación de Sofa para la familia "Moderna".
 */
public class SofaModerno implements Sofa {
    @Override
    public void acostarse() {
        System.out.println("Te acostaste en un sofa MODERNO (minimalista, colores neutros).");
    }
}

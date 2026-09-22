package AbstractFactory;

/**
 * PRODUCTO CONCRETO
 * Implementación de Sofa para la familia "Victoriana".
 */
public class SofaVictoriano implements Sofa {
    @Override
    public void acostarse() {
        System.out.println("Te acostaste en un sofa VICTORIANO (ornamentado, patas curvas).");
    }
}

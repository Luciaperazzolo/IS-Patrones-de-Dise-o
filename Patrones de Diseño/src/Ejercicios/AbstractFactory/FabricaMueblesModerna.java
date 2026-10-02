package AbstractFactory;

/**
 * FÁBRICA CONCRETA #1
 * Sabe crear la familia completa de muebles "Modernos".
 * Garantiza que la silla y el sofa que entrega siempre combinan entre sí.
 */
public class FabricaMueblesModerna implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }
}

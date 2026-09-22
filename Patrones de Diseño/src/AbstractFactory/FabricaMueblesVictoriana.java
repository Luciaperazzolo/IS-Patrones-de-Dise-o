package AbstractFactory;

/**
 * FÁBRICA CONCRETA #2
 * Sabe crear la familia completa de muebles "Victorianos".
 * Garantiza que la silla y el sofa que entrega siempre combinan entre sí.
 */
public class FabricaMueblesVictoriana implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }
}

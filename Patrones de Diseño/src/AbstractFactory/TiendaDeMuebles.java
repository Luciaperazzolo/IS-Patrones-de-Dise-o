package AbstractFactory;

/**
 * CLIENTE
 *
 * Esta clase es la que "usa" el patrón: solo conoce las interfaces
 * (FabricaMuebles, Silla, Sofa), nunca las clases concretas
 * (SillaModerna, SofaVictoriano, etc).
 *
 * Ventaja: si mañana agregamos una familia nueva, por ejemplo
 * "FabricaMueblesMinimalista", esta clase NO cambia ni una linea.
 */
public class TiendaDeMuebles {

    private final Silla silla;
    private final Sofa sofa;

    // La tienda recibe la fábrica por parámetro (inyección de dependencia).
    // No sabe ni le importa si es Moderna o Victoriana.
    public TiendaDeMuebles(FabricaMuebles fabrica) {
        this.silla = fabrica.crearSilla();
        this.sofa = fabrica.crearSofa();
    }

    public void mostrarMuebles() {
        silla.sentarse();
        sofa.acostarse();
    }
}

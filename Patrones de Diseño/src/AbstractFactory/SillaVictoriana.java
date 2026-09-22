package AbstractFactory;

/**
 * PRODUCTO CONCRETO
 * Implementación de Silla para la familia "Victoriana".
 */
public class SillaVictoriana implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Te sentaste en una silla VICTORIANA (madera tallada y terciopelo).");
    }
}

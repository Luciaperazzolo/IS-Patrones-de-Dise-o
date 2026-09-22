package AbstractFactory;

/**
 * PRODUCTO CONCRETO
 * Implementación de Silla para la familia "Moderna".
 */
public class SillaModerna implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Te sentaste en una silla MODERNA (lineas simples, metal y cuero).");
    }
}

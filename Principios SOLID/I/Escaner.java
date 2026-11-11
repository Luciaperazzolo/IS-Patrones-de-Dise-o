// Esta clase representa un escáner común.
// Solo implementa Escaneable porque no tiene función de impresión.
package I;
public class Escaner implements Escaneable {

    @Override
    public void escanear(String documento) {
        System.out.println("Escáner: escaneando " + documento);
    }
}
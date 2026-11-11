// Una impresora multifunción puede imprimir y escanear.
// Por eso implementa las dos interfaces separadas.
package I;
public class ImpresoraMultifuncion implements Imprimible, Escaneable {

    @Override
    public void imprimir(String documento) {
        System.out.println("Multifunción: imprimiendo " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("Multifunción: escaneando " + documento);
    }
}
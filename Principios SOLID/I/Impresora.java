// Esta clase representa una impresora común.
// Solamente implementa Imprimible porque no puede escanear.
package I;
public class Impresora implements Imprimible
{

    @Override
    public void imprimir(String documento)
    {
        System.out.println("Impresora: imprimiendo " + documento);
    }
}
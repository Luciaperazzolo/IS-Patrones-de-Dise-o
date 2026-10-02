package AbstractFactory;

/**
 * Acá decidimos QUÉ familia de muebles queremos usar,
 * eligiendo qué fábrica concreta le pasamos a la tienda.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("== Amueblando con estilo MODERNO ==");
        FabricaMuebles fabricaModerna = new FabricaMueblesModerna();
        TiendaDeMuebles tiendaModerna = new TiendaDeMuebles(fabricaModerna);
        tiendaModerna.mostrarMuebles();

        System.out.println();

        System.out.println("== Amueblando con estilo VICTORIANO ==");
        FabricaMuebles fabricaVictoriana = new FabricaMueblesVictoriana();
        TiendaDeMuebles tiendaVictoriana = new TiendaDeMuebles(fabricaVictoriana);
        tiendaVictoriana.mostrarMuebles();
    }
}

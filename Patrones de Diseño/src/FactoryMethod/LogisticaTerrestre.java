package FactoryMethod;

/**
 * Creador concreto: su fabrica devuelve un Camion.
 */
public class LogisticaTerrestre extends Logistica {

    @Override
    protected Transporte crearTransporte() {
        return new Camion();
    }
}


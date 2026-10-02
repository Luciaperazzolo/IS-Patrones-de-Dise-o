package FactoryMethod;

/**
 * Creador concreto: su fabrica devuelve un Barco.
 */

public class LogisticaMaritima extends Logistica {

    @Override
    protected Transporte crearTransporte() {
        return new Barco();
    }
}


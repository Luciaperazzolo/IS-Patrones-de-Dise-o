package FactoryMethod;

/**
 * Producto concreto: representa un transporte terrestre.
 */

public class Camion implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por tierra en un camion.");
    }
}


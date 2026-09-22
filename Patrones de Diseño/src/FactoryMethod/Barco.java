package FactoryMethod;

/**
 * Producto concreto: representa un transporte maritimo.
 */
public class Barco implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por mar en un barco.");
    }
}


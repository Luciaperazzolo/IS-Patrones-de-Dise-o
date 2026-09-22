package FactoryMethod;

/**
 * Desacoplamiento de la Creación:
 * Creador abstracto del patron Factory Method.
 * Declara el método abstracto llamado "crearTransporte()" 
 * (el "método fábrica"), y un flujo de negocio en planificarEntrega(). 
 * Logistica sabe qué hacer con el transporte (entregar()), pero no sabe 
 * si se trata de un Camion o de un Barco.
 */

public abstract class Logistica {

    protected abstract Transporte crearTransporte();

    public void planificarEntrega() {
        Transporte transporte = crearTransporte();
        transporte.entregar();
    }
}


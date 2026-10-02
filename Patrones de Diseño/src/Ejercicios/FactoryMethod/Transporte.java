package FactoryMethod;

/**
 * Interfaz "Producto" del patron Factory Method.
 * Todo tipo de transporte que la fabrica pueda crear debe
 * implementar este metodo de entrega.
 */

public interface Transporte {
    void entregar();
}

//Define correctamente el contrato común (entregar()) que todos los transportes deben cumplir.
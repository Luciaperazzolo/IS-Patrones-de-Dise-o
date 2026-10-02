package FactoryMethod;

/**
 * Clase principal (Cliente) que demuestra el uso del patrón Factory Method:
 * el cliente trabaja exclusivamente con las clases abstractas e interfaces (Logistica y Transporte).
 * Desconoce los detalles de implementación de las clases concretas (Camion y Barco)
 */

public class mainFactoryMethod {

    public static void main(String[] args) {
        System.err.println("--- Iniciando gestión de logística terrestre ---");
        
        // Se instancia el creador concreto de tipo terrestre
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        
        // Se ejecuta la lógica de negocio; internamente invocará a crearTransporte()
        logisticaTerrestre.planificarEntrega();

        System.out.println("\n--- Iniciando gestión de logística marítima ---");
        
        // Se instancia el creador concreto de tipo marítimo
        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planificarEntrega();
    }
}

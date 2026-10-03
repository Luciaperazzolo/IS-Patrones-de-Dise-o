package Entregables.Strategy;

public class ContextoPago {

    private EstrategiaPago estrategiaPago;

    public ContextoPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    // Permite cambiar la estrategia en tiempo de ejecución.
    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    // Ejecuta la estrategia seleccionada.
    public void realizarPago(double monto) {
        estrategiaPago.pagar(monto);
    }
}

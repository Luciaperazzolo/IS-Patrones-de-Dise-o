package Entregables.Strategy;

public class PagoPayPal implements EstrategiaPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado con PayPal.");
    }
}

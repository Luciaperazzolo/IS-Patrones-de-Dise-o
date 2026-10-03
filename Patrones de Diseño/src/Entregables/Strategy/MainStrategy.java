package Entregables.Strategy;

public class MainStrategy {

    public static void main(String[] args) {

        // Elegimos inicialmente la estrategia de tarjeta.
        ContextoPago contexto = new ContextoPago(new PagoTarjeta());

        contexto.realizarPago(15000);

        System.out.println();

        // Cambiamos la estrategia en tiempo de ejecución.
        contexto.setEstrategiaPago(new PagoPayPal());

        contexto.realizarPago(8500);
    }
}

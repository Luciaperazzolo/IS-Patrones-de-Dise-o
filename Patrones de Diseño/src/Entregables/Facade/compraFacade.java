package Entregables.Facade;

public class compraFacade {
    private Inventario inventario;
    private Pago pago;
    private Envio envio;

    public compraFacade() {
        inventario = new Inventario();
        pago = new Pago();
        envio = new Envio();
    }

    public void realizarCompra(String producto, double precio) {

        if (!inventario.verificarStock(producto)) {
            System.out.println("No hay stock.");
            return;
        }

        if (!pago.procesarPago(precio)) {
            System.out.println("El pago fue rechazado.");
            return;
        }

        envio.prepararEnvio(producto);

        System.out.println("Compra realizada correctamente.");
    }
}

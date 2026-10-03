package Entregables.Facade;

//CompraFacade es nuestra FACHADA.
//Su función es proporcionar una interfaz sencilla al cliente para realizar una operación que internamente necesita utilizar varios subsistemas.
public class compraFacade {
    //La Facade mantiene referencias a los subsistemas que necesita utilizar.
    private Inventario inventario;
    private Pago pago;
    private Envio envio;

    //Constructor de la Facade.
    //Acá creamos los objetos que representan a los diferentes subsistemas.
    public compraFacade() {
        inventario = new Inventario();
        pago = new Pago();
        envio = new Envio();
    }

    //Este es el método principal que utiliza el cliente.
    //El cliente solamente tiene que llamar a: realizarCompra(...), no necesita saber que se utiliza internamente Inventario, Pago y Envio.
    public void realizarCompra(String producto, double precio) {

        //Verifica si hay Stock llamando al subsistema.
        if (!inventario.verificarStock(producto)) {
            System.out.println("No hay stock.");
            return;
        }

        //Se procesa el pago llamando al otro subsistema, el usuario no necesita hacer todo directamente.
        //La facade se encarga de llamar al subsistema pago.
        if (!pago.procesarPago(precio)) {
            System.out.println("El pago fue rechazado.");
            return;
        }

        //Si hay Stock y el pago fue aprobado, se prepara el envio y se muestra el mensaje de compra realizada.
        envio.prepararEnvio(producto);

        System.out.println("Compra realizada correctamente.");
    }
}

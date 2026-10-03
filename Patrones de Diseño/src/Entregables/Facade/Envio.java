package Entregables.Facade;

//Esta clase representa otro subsistema.
//Su responsabilidad es preparar el envío del producto.
public class Envio {
    //Recibe el producto que se quiere enviar.
    //No devuelve ningún valor porque simplemente realiza una acción: preparar el envío.
    public void prepararEnvio(String producto) {
        System.out.println("Preparando envío de: " + producto);
    }
}

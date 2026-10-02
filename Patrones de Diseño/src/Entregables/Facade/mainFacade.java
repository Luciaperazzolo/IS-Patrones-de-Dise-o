package Entregables.Facade;

public class mainFacade {
    public static void main(String[] args) {

        compraFacade compra = new compraFacade();

        compra.realizarCompra("Notebook", 1000);
    }
}

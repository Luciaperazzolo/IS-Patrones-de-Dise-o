package Entregables.Facade;

public class mainFacade {
    public static void main(String[] args) {
        //Se crea una instancia de la Facade.
        //Internamente compraFacade crea los objetos Inventario, Pago y Envío.
        compraFacade compra = new compraFacade();
        System.out.println("\nPRIMER PRODUCTO");
        //El usuario le pasa los datos y facade hace todo internamente.
        compra.realizarCompra("Notebook", 1000);
        System.out.println("\nSEGUNDO PRODUCTO");
        compra.realizarCompra("Samsung", 6000);
    }
}

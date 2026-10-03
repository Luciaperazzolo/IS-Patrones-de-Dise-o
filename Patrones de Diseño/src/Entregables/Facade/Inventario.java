package Entregables.Facade;

//Esta clase representa uno de los subsistemas de nuestro sistema.
//Su responsabilidad es encargarse de verificar si un producto tiene stock disponible.
public class Inventario {
    //Recibe el nombre del producto y lo verifica, devuelve True(hay stock) o False(no hay stock).
    public boolean verificarStock(String producto) {
        System.out.println("Verificando stock de: " + producto);
        return true;
    }
}

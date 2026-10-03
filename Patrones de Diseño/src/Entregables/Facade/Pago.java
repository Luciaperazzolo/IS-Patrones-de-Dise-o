package Entregables.Facade;

//Esta clase representa otro subsistema.
//Su responsabilidad es encargarse del procesamiento del pago.
public class Pago {
    //Recibe el monto que se quiere pagar.
    //Devuelve True(si el pago se proceso con éxito) y False(si no se pudo).
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto);
        return true;
    }
}

package Entregables.Adapter;

public class PasarelaExterna {

    // Clase externa con una interfaz diferente.
    public void realizarCobro(double cantidad) {
        System.out.println(
            "Pago realizado mediante la pasarela externa: $" + cantidad
        );
    }
}
package Entregables.Adapter;

public class PasarelaAdapter implements SistemaPago {

    private PasarelaExterna pasarelaExterna;

    // El Adapter recibe la clase incompatible.
    public PasarelaAdapter(PasarelaExterna pasarelaExterna) {
        this.pasarelaExterna = pasarelaExterna;
    }

    @Override
    public void pagar(double monto) {

        // Adaptamos pagar() al método que entiende
        // la clase externa.
        pasarelaExterna.realizarCobro(monto);
    }
}
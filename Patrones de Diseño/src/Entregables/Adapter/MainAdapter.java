package Entregables.Adapter;

public class MainAdapter {

    public static void main(String[] args) {

        // Creamos la clase externa.
        PasarelaExterna pasarelaExterna =
            new PasarelaExterna();

        // La adaptamos a la interfaz SistemaPago.
        SistemaPago sistemaPago =
            new PasarelaAdapter(pasarelaExterna);

        // El cliente trabaja con SistemaPago.
        sistemaPago.pagar(15000);
    }
}
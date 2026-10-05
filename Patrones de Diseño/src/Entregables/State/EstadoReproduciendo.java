package Entregables.State;

public class EstadoReproduciendo implements EstadoReproductor {

    @Override
    public void actualizarEstado(Reproductor reproductor) {

        System.out.println(
            "La música está reproduciéndose. Pausando..."
        );

        // Cambiamos al estado Pausado.
        reproductor.setEstado(new EstadoPausado());
    }
}
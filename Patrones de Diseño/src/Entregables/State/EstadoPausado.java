package Entregables.State;

public class EstadoPausado implements EstadoReproductor {

    @Override
    public void actualizarEstado(Reproductor reproductor) {

        System.out.println(
            "La música está pausada. Deteniendo reproducción..."
        );

        // Cambiamos al estado Detenido.
        reproductor.setEstado(new EstadoDetenido());
    }
}
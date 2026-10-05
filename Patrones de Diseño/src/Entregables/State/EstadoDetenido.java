package Entregables.State;

public class EstadoDetenido implements EstadoReproductor {

    @Override
    public void actualizarEstado(Reproductor reproductor) {

        System.out.println(
            "El reproductor está detenido. Comenzando reproducción..."
        );

        // Cambiamos al estado Reproduciendo.
        reproductor.setEstado(new EstadoReproduciendo());
    }
}
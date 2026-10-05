package Entregables.State;

public interface EstadoReproductor {

    // Cada estado define su propio comportamiento.
    void actualizarEstado(Reproductor reproductor);
}
package Entregables.State;

public class Reproductor {

    private EstadoReproductor estado;

    public Reproductor() {

        // Estado inicial.
        estado = new EstadoDetenido();
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
    }

    public EstadoReproductor getEstado() {
        return estado;
    }

    // La acción depende del estado actual.
    public void cambiarEstado() {
        estado.actualizarEstado(this);
    }
}
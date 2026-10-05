package Entregables.State;

public class MainState {

    public static void main(String[] args) {

        Reproductor reproductor = new Reproductor();

        // Detenido -> Reproduciendo
        reproductor.cambiarEstado();

        // Reproduciendo -> Pausado
        reproductor.cambiarEstado();

        // Pausado -> Detenido
        reproductor.cambiarEstado();

        // Detenido -> Reproduciendo nuevamente
        reproductor.cambiarEstado();
    }
}
package Entregables.Observer;

// Clase principal: prueba el patrón creando el noticiero y sus observadores.

public class Main {

    public static void main(String[] args) {
       
        Noticiero noticiero = new Noticiero();

        Celular celular = new Celular();
        Computadora compu = new Computadora();

        noticiero.agregar(celular);
        noticiero.agregar(compu);

        noticiero.setNoticia("Llueve en la ciudad");
        noticiero.setNoticia("Mañana hay paro de colectivos");

        // Si sacamos un observador, ya no recibe avisos
        noticiero.quitar(compu);
        noticiero.setNoticia("Se suspenden las clases");
    }
}

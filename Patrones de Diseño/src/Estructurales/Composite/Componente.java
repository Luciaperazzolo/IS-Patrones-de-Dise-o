package Estructurales.Composite;

public interface Componente {

    // Muestra el componente en pantalla.
    void mostrar(int nivel);

    // Devuelve el nombre del componente.
    String obtenerNombre();

    // Devuelve el tamaño del componente.
    int obtenerTamanio();
}

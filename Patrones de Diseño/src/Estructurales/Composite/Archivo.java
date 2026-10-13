package Estructurales.Composite;

public class Archivo implements Componente {

    private String nombre;
    private int tamanio;

    public Archivo(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    @Override
    public void mostrar(int nivel) {

        String espacios = "  ".repeat(nivel);
        System.out.println(espacios + "Archivo: " + nombre + " - " + tamanio + " KB");
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public int obtenerTamanio() {
        return tamanio;
    }
}
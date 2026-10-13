package Estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements Componente {

    private String nombre;
    private List<Componente> componentes;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    // Agrega un archivo o directorio.
    public void agregar(Componente componente) {
        componentes.add(componente);
    }

    // Elimina un componente.
    public void eliminar(Componente componente) {
        componentes.remove(componente);
    }

    // Obtiene un componente según su posición.
    public Componente obtenerHijo(int indice) {
        return componentes.get(indice);
    }

    @Override
    public void mostrar(int nivel) {

        String espacios = "  ".repeat(nivel);
        System.out.println(espacios + "Directorio: " + nombre);

        // Mostramos todos los componentes internos.
        for (Componente componente : componentes) {
            componente.mostrar(nivel + 1);
        }
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public int obtenerTamanio() {

        int tamanioTotal = 0;

        // El tamaño del directorio es la suma
        // del tamaño de todos sus componentes.
        for (Componente componente : componentes) {
            tamanioTotal += componente.obtenerTamanio();
        }

        return tamanioTotal;
    }
}
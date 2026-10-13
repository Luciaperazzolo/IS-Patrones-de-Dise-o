package Conductuales.Iterator;

import java.util.List;

public class IteradorLibros implements Iterador<Libro>{
    private List<Libro> libros;
    private int posicion = 0;

    public IteradorLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < libros.size();
    }

    @Override
    public Libro siguiente() {
        if (!tieneSiguiente()) {
            throw new java.util.NoSuchElementException("No hay mas libros para recorrer.");
        }
        Libro libro = libros.get(posicion);
        posicion++;
        return libro;
    }
}

package Conductuales.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Coleccion<Libro>{
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Iterador<Libro> crearIterador() {
        return new IteradorLibros(libros);
    }
}

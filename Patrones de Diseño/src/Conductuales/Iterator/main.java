package Conductuales.Iterator;

public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("Clean Code"));
        biblioteca.agregarLibro(new Libro("El principito"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad"));

        Iterador<Libro> iterador = biblioteca.crearIterador();

        while (iterador.tieneSiguiente()) {
            Libro libro = iterador.siguiente();
            System.out.println(libro.getTitulo());
        }
    }
}

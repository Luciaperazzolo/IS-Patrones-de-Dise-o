package Estructurales.Flyweight;

public class Libro {
    private String titulo;
    private String autor;
    private Categoria categoria;

    public Libro(String titulo, String autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public void mostrarDatos() {
        System.out.println(
            "Titulo: " + titulo
            + " | Autor: " + autor
            + " | Categoria: " + categoria.getNombre()
            + " | Color: " + categoria.getColor()
        );
    }

    public Categoria getCategoria() {
        return categoria;
    }
}

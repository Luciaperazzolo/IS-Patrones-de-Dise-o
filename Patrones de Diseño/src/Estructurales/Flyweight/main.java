package Estructurales.Flyweight;

public class main {
    public static void main(String[] args) {
        Categoria programacion = CategoriaFactory.obtenerCategoria("Programacion", "Azul");
        Categoria literatura = CategoriaFactory.obtenerCategoria("Literatura", "Verde");
        Categoria programacion2 = CategoriaFactory.obtenerCategoria("Programacion", "Azul");

        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", programacion);
        Libro libro2 = new Libro("Java para principiantes", "Autor A", programacion2);
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupery", literatura);

        System.out.println();
        libro1.mostrarDatos();
        libro2.mostrarDatos();
        libro3.mostrarDatos();

        System.out.println();
        System.out.println(
            "¿Los dos libros comparten la categoria? "
            + (libro1.getCategoria() == libro2.getCategoria())
        );
    }
}

package Estructurales.Flyweight;

public class Categoria {
    private final String nombre;
    private final String color;

    public Categoria(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
}

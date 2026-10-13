package Estructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CategoriaFactory {
    private static final Map<String, Categoria> categorias = new HashMap<>();

    public static Categoria obtenerCategoria(String nombre, String color) {
        if (!categorias.containsKey(nombre)) {
            categorias.put(nombre, new Categoria(nombre, color));
            System.out.println("Creando categoria: " + nombre);
        }
        return categorias.get(nombre);
    }
}

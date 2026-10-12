package Conductuales.Interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CONTEXTO: guarda la información del cliente (sus etiquetas, como VIP o
 * ESTUDIANTE) sobre la cual se evalúan las reglas.
 */
public class Contexto {

    private Set<String> etiquetas = new HashSet<>();

    public Contexto(String... etiquetas) {
        this.etiquetas.addAll(Arrays.asList(etiquetas));
    }

    public boolean tiene(String etiqueta) {
        return etiquetas.contains(etiqueta);
    }
}

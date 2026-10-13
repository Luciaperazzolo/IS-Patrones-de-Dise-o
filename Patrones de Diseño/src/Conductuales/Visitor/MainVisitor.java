package Conductuales.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MainVisitor {
    public static void main(String[] args) {
        // Creamos una lista de elementos.
        List<ElementoDocumento> elementos = new ArrayList<>();

        // Agregamos párrafos e imágenes.
        elementos.add(new Parrafo("Introducción al patrón Visitor."));

        elementos.add(new ImagenDocumento("diagrama.png"));

        elementos.add(new Parrafo("Conclusión del documento."));

        // Creamos el visitante que muestra los elementos.
        VisitanteMostrar mostrar = new VisitanteMostrar();

        System.out.println("Contenido del documento:");

        // Cada elemento acepta al visitante.
        for (ElementoDocumento elemento : elementos) {
            elemento.aceptar(mostrar);
        }

        System.out.println();

        // Creamos el visitante que cuenta los elementos.
        VisitanteContar contar = new VisitanteContar();

        // Recorremos nuevamente el documento.
        for (ElementoDocumento elemento : elementos) {
            elemento.aceptar(contar);
        }
        System.out.println("Resumen del documento:");

        System.out.println("Cantidad de párrafos: " + contar.getCantidadParrafos());

        System.out.println("Cantidad de imágenes: " + contar.getCantidadImagenes());
    }
}
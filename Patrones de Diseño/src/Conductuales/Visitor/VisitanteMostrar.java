package Conductuales.Visitor;

public class VisitanteMostrar implements Visitante {
    @Override
    public void visitar(Parrafo parrafo) {
        // Mostramos el contenido del párrafo.
        System.out.println("Párrafo: " + parrafo.getTexto());
    }

    @Override
    public void visitar(ImagenDocumento imagen) {
        // Mostramos el nombre de la imagen.
        System.out.println("Imagen: " + imagen.getNombreArchivo());
    }
}
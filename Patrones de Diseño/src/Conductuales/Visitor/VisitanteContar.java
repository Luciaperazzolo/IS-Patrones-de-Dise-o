package Conductuales.Visitor;

public class VisitanteContar implements Visitante {
    private int cantidadParrafos;
    private int cantidadImagenes;

    @Override
    public void visitar(Parrafo parrafo) {
        // Incrementamos la cantidad de párrafos.
        cantidadParrafos++;
    }

    @Override
    public void visitar(ImagenDocumento imagen) {
        // Incrementamos la cantidad de imágenes.
        cantidadImagenes++;
    }

    public int getCantidadParrafos() {
        return cantidadParrafos;
    }

    public int getCantidadImagenes() {
        return cantidadImagenes;
    }
}
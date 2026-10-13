package Conductuales.Visitor;

public interface Visitante {
    // Operación para trabajar con párrafos.
    void visitar(Parrafo parrafo);

    // Operación para trabajar con imágenes.
    void visitar(ImagenDocumento imagen);
}
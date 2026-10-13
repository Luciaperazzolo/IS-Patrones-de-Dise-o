package Conductuales.Visitor;

public interface ElementoDocumento {
    // Todos los elementos deben aceptar un visitante.
    void aceptar(Visitante visitante);
}
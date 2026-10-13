package Conductuales.Visitor;

public class Parrafo implements ElementoDocumento {
    private String texto;

    public Parrafo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void aceptar(Visitante visitante) {
        // El párrafo recibe un visitante.
        visitante.visitar(this);
    }
}
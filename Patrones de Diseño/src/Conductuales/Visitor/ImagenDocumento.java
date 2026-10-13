package Conductuales.Visitor;

public class ImagenDocumento implements ElementoDocumento {

    private String nombreArchivo;

    public ImagenDocumento(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public void aceptar(Visitante visitante) {
        // La imagen recibe un visitante.
        visitante.visitar(this);
    }
}
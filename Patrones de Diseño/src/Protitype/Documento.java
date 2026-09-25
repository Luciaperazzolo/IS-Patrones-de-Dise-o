package Protitype;

public class Documento implements Prototype{

    private String titulo;
    private String autor;
    private String contenido;
    private String tipo;

    //Constructor
    public Documento(String titulo, String autor, String contenido, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
        this.tipo = tipo;
    }

    //Constructor de copia
    private Documento(Documento documento) {
        this.titulo = documento.titulo;
        this.autor = documento.autor;
        this.contenido = documento.contenido;
        this.tipo = documento.tipo;
    }

     @Override
    public Documento clonar() {
        return new Documento(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", contenido='" + contenido + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

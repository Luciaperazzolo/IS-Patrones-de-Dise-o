package I;
public class Main
{
    public static void imprimirDocumento(Imprimible dispositivo, String documento) {
        dispositivo.imprimir(documento);
    }

    public static void escanearDocumento(Escaneable dispositivo, String documento) {
        dispositivo.escanear(documento);
    }

    public static void main(String[] args) {

        // Impresora común
        Imprimible impresora = new Impresora();
        imprimirDocumento(impresora, "Trabajo práctico.pdf");

        // Escáner común
        Escaneable escaner = new Escaner();
        escanearDocumento(escaner, "Foto.png");

        // Impresora multifunción
        ImpresoraMultifuncion multifuncion = new ImpresoraMultifuncion();
        imprimirDocumento(multifuncion, "Informe.docx");
        escanearDocumento(multifuncion, "DNI.jpg");
    }
}
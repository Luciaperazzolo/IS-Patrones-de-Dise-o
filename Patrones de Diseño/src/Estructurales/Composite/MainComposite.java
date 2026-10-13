package Estructurales.Composite;

public class MainComposite {

    public static void main(String[] args) {

        // Creamos archivos.
        Componente archivo1 = new Archivo("documento.txt", 20);

        Componente archivo2 = new Archivo("foto.jpg", 500);

        Componente archivo3 = new Archivo("trabajo.pdf", 250);

        // Creamos un directorio.
        Directorio documentos = new Directorio("Documentos");

        documentos.agregar(archivo1);
        documentos.agregar(archivo3);

        // Creamos el directorio principal.
        Directorio principal = new Directorio("Mi PC");

        principal.agregar(documentos);
        principal.agregar(archivo2);

        // Mostramos toda la estructura.
        principal.mostrar(0);

        System.out.println();
        System.out.println("Tamaño total: " + principal.obtenerTamanio() + " KB");
    }
}

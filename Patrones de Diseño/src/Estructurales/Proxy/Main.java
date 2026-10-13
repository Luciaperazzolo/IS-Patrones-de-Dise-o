package Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto real.
        SujetoReal sujetoReal = new SujetoReal();

        // Creamos el Proxy.
        Sujeto sujeto = new Proxy(sujetoReal);

        // El cliente utiliza el Proxy.
        System.out.println("Primera solicitud:");
        sujeto.solicitar();

        System.out.println();

        // Creamos un Proxy sin objeto real disponible.
        Sujeto otroSujeto = new Proxy(null);

        System.out.println("Segunda solicitud:");
        otroSujeto.solicitar();
    }
}
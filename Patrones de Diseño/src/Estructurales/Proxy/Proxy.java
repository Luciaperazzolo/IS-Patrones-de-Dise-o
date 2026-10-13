package Estructurales.Proxy;

public class Proxy implements Sujeto {

    private SujetoReal sujetoReal;

    // Recibe el objeto real que va a controlar.
    public Proxy(SujetoReal sujetoReal) {
        this.sujetoReal = sujetoReal;
    }

    @Override
    public void solicitar() {
        System.out.println("Proxy: verificando el acceso...");

        // Comprobamos si existe un objeto real.
        if (sujetoReal != null) {
            System.out.println("Proxy: solicitud permitida.");

            // Delegamos la operación al objeto real.
            sujetoReal.solicitar();
        }
        else {
            System.out.println("Proxy: acceso no disponible.");
        }
    }
}
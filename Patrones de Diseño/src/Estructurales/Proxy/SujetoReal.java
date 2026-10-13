package Estructurales.Proxy;

public class SujetoReal implements Sujeto {
    @Override
    public void solicitar() {
        System.out.println("SujetoReal: ejecutando la solicitud.");
    }
}
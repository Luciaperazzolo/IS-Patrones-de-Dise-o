package Entregables.ChainofResponsibility;

//Esta clase representa la solicitud que queremos procesar, representa el problema del cliente
public class Solicitud {
    private int nivel; //Indica qué nivel de soporte necesita la solicitud (simple, intermedio, complejo).
    private String descripcion; //Guarda una descripción del problema.

    //Constructor de la solicitud.
    public Solicitud(int nivel, String descripcion) {
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    //Permite obtener el nivel de la solicitud.
    public int getNivel() {
        return nivel;
    }

    //Permite obtener la descripción del problema.
    public String getDescripcion() {
        return descripcion;
    }
}

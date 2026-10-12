package Creacionales.ObjectPool;

/**
 * OBJETO REUTILIZABLE: representa una conexión a la base de datos.
 * Crearla es costoso, por eso conviene reutilizarla en vez de crear una nueva cada vez.
 */
public class Conexion {

    private int id;

    public Conexion(int id) {
        this.id = id;
        System.out.println("Creando conexión #" + id + " (costoso)");
    }

    public void ejecutar(String consulta) {
        System.out.println("Conexión #" + id + " ejecutando: " + consulta);
    }

    public int getId() {
        return id;
    }
}

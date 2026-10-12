package Creacionales.ObjectPool;

import java.util.ArrayList;
import java.util.List;

/**
 * POOL: crea un conjunto fijo de conexiones al iniciar y las va prestando.
 * Los clientes piden una con obtener() y la devuelven con liberar().
 */
public class PoolConexiones {

    private List<Conexion> disponibles = new ArrayList<>();

    // Crea todas las conexiones una sola vez, al armar el pool
    public PoolConexiones(int tamanio) {
        for (int i = 1; i <= tamanio; i++) {
            disponibles.add(new Conexion(i));
        }
    }

    // Presta una conexión; si no queda ninguna libre, devuelve null
    public Conexion obtener() {
        if (disponibles.isEmpty()) {
            System.out.println("No hay conexiones disponibles");
            return null;
        }
        return disponibles.remove(0);
    }

    // Devuelve la conexión al pool para que otro cliente la reutilice
    public void liberar(Conexion conexion) {
        disponibles.add(conexion);
        System.out.println("Conexión #" + conexion.getId() + " devuelta al pool");
    }
}

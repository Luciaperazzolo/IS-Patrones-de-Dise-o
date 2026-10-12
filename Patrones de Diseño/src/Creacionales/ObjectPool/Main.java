package Creacionales.ObjectPool;

/**
 * CLIENTE: pide conexiones al pool, las usa y las devuelve,
 * mostrando que se reutilizan en lugar de crearse de nuevo.
 */
public class Main {

    public static void main(String[] args) {

        PoolConexiones pool = new PoolConexiones(2); // se crean 2 conexiones

        Conexion c1 = pool.obtener();
        c1.ejecutar("SELECT * FROM clientes");

        Conexion c2 = pool.obtener();
        c2.ejecutar("SELECT * FROM pedidos");

        pool.obtener(); // el pool está vacío: no hay conexiones libres

        pool.liberar(c1); // c1 vuelve al pool

        Conexion c3 = pool.obtener(); // recibe la misma conexión que c1
        c3.ejecutar("SELECT * FROM productos");

        System.out.println("¿c3 es la misma conexión que c1? " + (c3 == c1));
    }
}

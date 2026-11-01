/*
 * Nuevo tipo de descuento para clientes frecuentes.
 * Esta clase demuestra que podemos extender el sistema
 * agregando nuevas funcionalidades sin modificar la clase CalculadoraDescuentos.
 */

public class DescuentoClienteFrecuente implements Descuento {

    @Override
    public double calcular(double precio) {

        // Calculamos el 25% del precio original.
        return precio * 0.25;
    }
}
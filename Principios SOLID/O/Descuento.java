/*
 * PRINCIPIO O - OPEN/CLOSED (ABIERTO/CERRADO)
 * Esta interfaz representa un descuento genérico.
 * Su objetivo es establecer una regla común para todos los
 * tipos de descuentos que puedan existir en nuestro sistema.
 * Gracias a esta interfaz, podemos agregar nuevos descuentos
 * sin tener que modificar la calculadora de precios.
 */

public interface Descuento {
    double calcular(double precio);
}
/*
     * Este método recibe el precio original de un producto y devuelve el importe que se debe descontar.
     *
     * Cada clase que implemente esta interfaz debe definir cómo se calcula su descuento.
     *
     * Por ejemplo:
     * - Un estudiante puede recibir un 15%.
     * - Un jubilado puede recibir un 20%.
*/
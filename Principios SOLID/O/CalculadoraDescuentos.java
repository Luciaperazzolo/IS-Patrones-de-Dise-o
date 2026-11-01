/*
 * Esta clase se encarga de calcular el precio final
 * de un producto después de aplicar un descuento.
 *
 * APLICACIÓN DEL PRINCIPIO OPEN/CLOSED:
 *
 * La calculadora utiliza la interfaz Descuento en lugar
 * de depender de una clase específica, como
 * DescuentoEstudiante o DescuentoJubilado.
 *
 * Esto permite incorporar nuevos descuentos sin modificar
 * el código de esta calculadora.
 *
 * Por eso decimos que esta clase está:
 *
 * - Abierta a la extensión: podemos usar nuevos descuentos.
 * - Cerrada a la modificación: no necesitamos cambiar
 *   su lógica cada vez que aparece un descuento nuevo.
 */

public class CalculadoraDescuentos {

    public double calcularPrecioFinal(double precio, Descuento descuento) {

        double montoDescuento = descuento.calcular(precio);

        return precio - montoDescuento;
    }
}

/*
    * Este método calcula el precio final del producto.
    * Recibe dos parámetros:
     * precio: el precio original del producto.
     * descuento: un objeto que implementa la interfaz
    * Descuento. Puede ser un descuento de estudiante, jubilado o cualquier otro descuento que agreguemos.
*/

/*
    * Llamamos al método calcular() del descuento recibido.
    * Java ejecutará automáticamente el método correspondiente al tipo de descuento que se haya enviado.
    * Finalmente, restamos el importe del descuento al precio original y devolvemos el precio final.
        * Ejemplo:
        * Precio original: $10000
        * Descuento estudiante: $1500
        * Precio final: $8500
*/
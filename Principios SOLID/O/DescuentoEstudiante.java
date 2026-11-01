/*
 * Esta clase implementa la interfaz Descuento.
 * Representa un tipo específico de descuento: el descuento del 15% para estudiantes.
 * Al implementar Descuento, esta clase está obligada a definir el método calcular().
*/

public class DescuentoEstudiante implements Descuento {

    @Override
    public double calcular(double precio) {
        return precio * 0.15;
    }
}

/*
    * Calculamos el 15% del precio recibido.
    * Ejemplo:
    * Si el producto cuesta $10000:
    * 10000 * 0.15 = 1500
    * El método devuelve $1500, que es el importe del descuento, NO el precio final del producto.
*/
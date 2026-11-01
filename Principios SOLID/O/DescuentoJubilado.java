/*
 * Esta clase representa el descuento para jubilados.
 * También implementa la interfaz Descuento, por lo que debe definir su propia versión del método calcular().
 * De esta manera, cada tipo de descuento tiene su propia lógica de cálculo, sin afectar a los demás.
*/

public class DescuentoJubilado implements Descuento {

    @Override
    public double calcular(double precio) {
        return precio * 0.20;
    }
}

/*
    * Calculamos el 20% del precio original.
    *Se devuelve $2000, que es la cantidad de dinero que se descontará del precio original.
*/
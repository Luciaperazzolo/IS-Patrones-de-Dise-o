package Conductuales.Interpreter;

/**
 * CLIENTE: arma la regla de descuento de una tienda como un árbol de
 * expresiones y la interpreta para distintos clientes.
 */
public class Main {

    public static void main(String[] args) {

        // Regla: VIP Y (CUPON O ESTUDIANTE)
        Expresion regla = new Y(
                new Etiqueta("VIP"),
                new O(new Etiqueta("CUPON"), new Etiqueta("ESTUDIANTE")));

        System.out.println("Regla: VIP Y (CUPON O ESTUDIANTE)");

        Contexto cliente1 = new Contexto("VIP", "CUPON");
        Contexto cliente2 = new Contexto("VIP");
        Contexto cliente3 = new Contexto("VIP", "ESTUDIANTE");

        System.out.println("Cliente 1 (VIP, CUPON): " + regla.interpretar(cliente1));
        System.out.println("Cliente 2 (VIP): " + regla.interpretar(cliente2));
        System.out.println("Cliente 3 (VIP, ESTUDIANTE): " + regla.interpretar(cliente3));
    }
}

package Conductuales.Mediator;

public class MainMediator {
    public static void main(String[] args) {
        // Creamos el mediador.
        Mediador sala = new SalaChat();

        // Creamos los usuarios.
        Usuario juan = new Usuario("Juan", sala);
        Usuario maria = new Usuario("Maria", sala);
        Usuario pedro = new Usuario("Pedro", sala);

        // Registramos los usuarios en la sala.
        sala.agregarUsuario(juan);
        sala.agregarUsuario(maria);
        sala.agregarUsuario(pedro);

        // Juan envía un mensaje.
        juan.enviar("Hola, como estan?");

        System.out.println();

        // Maria responde.
        maria.enviar("Hola Juan, todo bien.");

        System.out.println();

        // Pedro envía otro mensaje.
        pedro.enviar("Buenas, soy Pedro.");
    }
}
package Entregables.ChainofResponsibility;

class SoporteNivel3 extends SoporteHandler {
    @Override
    public void manejar(Solicitud solicitud) {

        if (solicitud.getNivel() == 3) {
            System.out.println("Nivel 3 resolvió: " + solicitud.getDescripcion());

          //Si llegamos hasta acá significa que ningún Handler pudo resolver la solicitud.
          //Como Nivel 3 es el último elemento de la cadena, ya no existe un siguiente Handler.
        } else {
            System.out.println("Ningún nivel pudo resolver la solicitud.");
        }
    }
}

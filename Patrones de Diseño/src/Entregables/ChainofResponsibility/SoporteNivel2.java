package Entregables.ChainofResponsibility;

class SoporteNivel2 extends SoporteHandler {
    @Override
    public void manejar(Solicitud solicitud) {

        if (solicitud.getNivel() == 2) {
            System.out.println("Nivel 2 resolvió: "+ solicitud.getDescripcion());

        } else if (siguiente != null) {
            siguiente.manejar(solicitud);
        }
    }
}

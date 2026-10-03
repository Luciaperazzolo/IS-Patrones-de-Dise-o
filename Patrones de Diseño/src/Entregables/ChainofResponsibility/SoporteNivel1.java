package Entregables.ChainofResponsibility;

//Esta clase representa al primer elemento de la cadena, hereda de SoporteHandler.
class SoporteNivel1 extends SoporteHandler {
    //Implementamos el método manejar().
    @Override
    public void manejar(Solicitud solicitud) {

        //Comprobamos si esta solicitud corresponde al nivel 1.
        //Si corresponde al nivel 1 este Handler se encarga de resolverla.
        if (solicitud.getNivel() == 1) {
            System.out.println("Nivel 1 resolvió: " + solicitud.getDescripcion());

          //Si no es una solicitud de Nivel 1, comprobamos si existe un siguiente Handler.
          //Como Nivel 1 no puede resolverla, se la pasa al siguiente Handler. 
        } else if (siguiente != null) {
            siguiente.manejar(solicitud);
        }
    }
}

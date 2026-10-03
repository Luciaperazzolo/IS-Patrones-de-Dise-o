package Entregables.ChainofResponsibility;

//Esta es la clase abstracta que representa a un Handler.
//Una clase diseñada específicamente para recibir, procesar o atender una petición, solicitud o evento.
abstract class SoporteHandler {
    protected SoporteHandler siguiente; //Guarda una referencia al siguiente elemento de la cadena.
                                        //Si este Handler no puede resolver una solicitud, se la pasa al objeto guardado en "siguiente".

    //Permite establecer quién será el siguiente Handler.
    //Por ejemplo: nivel1.setSiguiente(nivel2);
    //"Si Nivel 1 no puede resolver la solicitud, se la pasa a Nivel 2".
    public void setSiguiente(SoporteHandler siguiente) {
        this.siguiente = siguiente;
    }

    //Cada Handler tendrá su propia forma de manejar, una solicitud.
    //Por eso este método es abstracto, las clases hijas deberán implementarlo.
    public abstract void manejar(Solicitud solicitud);
}

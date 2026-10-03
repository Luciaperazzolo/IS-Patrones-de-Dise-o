package Entregables.ChainofResponsibility;

//Esta es la clase que utiliza la cadena, solo la inicia.
public class mainChain {
    public static void main(String[] args){
        //Se crean los elementos de la tarea.
        SoporteHandler nivel1 = new SoporteNivel1();
        SoporteHandler nivel2 = new SoporteNivel2();
        SoporteHandler nivel3 = new SoporteNivel3();

        //Construimos la cadena de responsabilidad.
        //Si Nivel 1 no puede resolver, pasa la solicitud a Nivel 2 y asi con los démas. 
        nivel1.setSiguiente(nivel2);
        nivel2.setSiguiente(nivel3);

        //Creamos una solicitud de Nivel 2, 
        Solicitud solicitud = new Solicitud(2, "El sistema no permite realizar una operación.");
        //Se inicia la cadena en el nivel 1.
        nivel1.manejar(solicitud);
    }
}

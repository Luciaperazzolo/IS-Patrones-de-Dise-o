package Singleton;

public class mainSingleton {
    public static void main(String[] args) throws Exception {

        //Obtenemos la única instancia de singletonConfig
        singletonConfig configuracion1 = singletonConfig.getInstancia();

        //Mostramos la configuración inicial
        System.out.println("Configuración inicial:"); 
        System.out.println("Idioma: " + configuracion1.getIdioma()); 
        System.out.println("Tema: " + configuracion1.getTema());

        // Modificamos la configuración 
        configuracion1.setIdioma("Inglés"); 
        configuracion1.setTema("Claro");

        // Mostramos la configuración modificada 
        System.out.println("\nConfiguración modificada:"); 
        System.out.println("Idioma: " + configuracion1.getIdioma()); 
        System.out.println("Tema: " + configuracion1.getTema());

        // Obtenemos nuevamente la instancia 
        singletonConfig otraConfig = singletonConfig.getInstancia();

        // Comprobamos que ambas variables apuntan a la misma instancia 
        System.out.println("\n¿Es la misma instancia?"); 
        System.out.println(configuracion1 == otraConfig);
    }
}

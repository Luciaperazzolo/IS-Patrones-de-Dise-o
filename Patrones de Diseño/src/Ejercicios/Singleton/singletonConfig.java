package Singleton;

public class singletonConfig{
    //Única instancia de la clase. 
    //Se declara static para que exista una sola instancia compartida por toda la aplicación.
    private static singletonConfig instancia;

    //datos de configuracion que se van a compartir por todas las partes que utilicen singletonConfig
    private String idioma;
    private String tema;

    //Constructor Privado
    //Al ser private, ninguna otra clase puede crear directamente un objeto utilizando new singletonConfig().
    private singletonConfig(){
        idioma = "Español";
        tema = "Oscuro";
    }

    //Método público y static que permite obtener la única instancia de singletonConfig.
    public static singletonConfig getInstancia(){
        if(instancia == null){
            instancia = new singletonConfig();
        }
        return instancia;
    }

    //getteres 
    //Devuelve el idioma y tema configurado
    public String getIdioma(){
        return idioma;
    }
    public String getTema(){
        return tema;
    }

    //Setters 
    //Permite modificar el tema e idioma configurado
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    public void setTema(String tema){
        this.tema = tema;
    }

}
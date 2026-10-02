package Protitype;

public class mainPrototype {
    public static void main(String[] args){
        //Creamos un documento modelo
        Documento informeModelo = new Documento(
            "Informe de Proyecto",
            "Administración",
            "Contenido general del informe.",
            "Informe"
        );

        //Creamos el registro de prototipos
        RegistroPrototipos registro = new RegistroPrototipos();

        //Registramos el documento modelo
        registro.registrar("informe", informeModelo);

        //Clonamos el prototipo
        Documento informeEnero = registro.obtener("informe");

        //Modificamos solamente los datos necesarios
        informeEnero.setTitulo("Informe de Proyecto - Enero");

        //Creamos otro clon
        Documento informeFebrero = registro.obtener("informe");

        informeFebrero.setTitulo("Informe de Proyecto - Febrero");
        
        //Mostramos los documentos
        System.out.println("Documento original:");
        System.out.println(informeModelo);

        System.out.println();

        System.out.println("Clon de Enero:");
        System.out.println(informeEnero);

        System.out.println();

        System.out.println("Clon de Febrero:");
        System.out.println(informeFebrero);
    }


}

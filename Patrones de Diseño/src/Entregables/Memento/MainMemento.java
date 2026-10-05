package Entregables.Memento;

public class MainMemento {

    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        // Primer estado.
        editor.escribir("Hola");
        historial.guardar(editor.guardar());

        System.out.println(
            "Estado guardado: " + editor.getContenido()
        );

        // Segundo estado.
        editor.escribir("Hola Mundo");
        historial.guardar(editor.guardar());

        System.out.println(
            "Estado guardado: " + editor.getContenido()
        );

        // Modificamos nuevamente el texto.
        editor.escribir("Texto modificado por error");

        System.out.println(
            "Estado actual: " + editor.getContenido()
        );

        // Recuperamos el último estado guardado.
        editor.restaurar(historial.deshacer());

        System.out.println(
            "Después de deshacer: " + editor.getContenido()
        );

        // Recuperamos otro estado anterior.
        editor.restaurar(historial.deshacer());

        System.out.println(
            "Después de deshacer nuevamente: "
                + editor.getContenido()
        );
    }
}
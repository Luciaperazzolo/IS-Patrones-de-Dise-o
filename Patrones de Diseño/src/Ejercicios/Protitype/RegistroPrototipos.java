package Protitype;
import java.util.HashMap;
import java.util.Map;

public class RegistroPrototipos {

    private Map<String, Documento> prototipos;

    public RegistroPrototipos() {
        prototipos = new HashMap<>();
    }

    public void registrar(String nombre, Documento documento) {
        prototipos.put(nombre, documento);
    }

    public Documento obtener(String nombre) {
        Documento prototipo = prototipos.get(nombre);
        if (prototipo == null) {
            throw new IllegalArgumentException(
                "No existe un prototipo registrado con el nombre: " + nombre);
        }
        return prototipo.clonar();
    }

}

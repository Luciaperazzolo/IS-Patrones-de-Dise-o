/*Esta interfaz se encarga únicamente de la función de escanear.*/
package I;
public interface Escaneable 
{
    void escanear(String documento);
}
/*  La separamos de Imprimible para que cada dispositivo
    Implemente solamente las funciones que realmente necesita.
*/
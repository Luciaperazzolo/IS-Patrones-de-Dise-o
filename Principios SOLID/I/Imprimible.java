/*
    PRINCIPIO I - INTERFACE SEGREGATION (SEGREGACIÓN DE INTERFACES)
    Esta interfaz contiene solamente la función de imprimir.
*/
package I;
public interface Imprimible
{
    void imprimir(String documento);
}
//Los dispositivos que solo imprimen no necesitan implementar métodos de escaneo que no van a utilizar.
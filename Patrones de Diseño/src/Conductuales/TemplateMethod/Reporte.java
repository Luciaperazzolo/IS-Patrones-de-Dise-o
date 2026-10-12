package Conductuales.TemplateMethod;

/**
 * CLASE ABSTRACTA: define el esqueleto (la "plantilla") para generar un reporte.
 * El método generar() fija el orden de los pasos; las subclases solo completan
 * los pasos que cambian (formatear y exportar).
 */
public abstract class Reporte {

    // MÉTODO PLANTILLA: define el algoritmo y no se puede sobrescribir (final)
    public final void generar() {
        obtenerDatos();      // paso común (igual para todos)
        formatear();         // paso que varía (lo define cada subclase)
        exportar();          // paso que varía (lo define cada subclase)
        if (enviarPorEmail()) { // hook: la subclase decide si se ejecuta
            enviarEmail();
        }
    }

    // Paso común: lo hace la clase abstracta, igual para todos
    private void obtenerDatos() {
        System.out.println("1. Obteniendo datos de ventas...");
    }

    // Pasos abstractos: cada subclase está obligada a implementarlos
    protected abstract void formatear();

    protected abstract void exportar();

    // Hook: tiene un comportamiento por defecto y se puede sobrescribir si hace falta
    protected boolean enviarPorEmail() {
        return false;
    }

    private void enviarEmail() {
        System.out.println("4. Enviando reporte por email...");
    }
}

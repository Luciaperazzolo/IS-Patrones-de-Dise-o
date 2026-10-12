package Conductuales.TemplateMethod;

/**
 * CLASE CONCRETA: genera el reporte en formato Excel.
 * Además de los pasos obligatorios, activa el hook para enviarlo por email.
 */
public class ReporteExcel extends Reporte {

    @Override
    protected void formatear() {
        System.out.println("2. Formateando como tabla Excel...");
    }

    @Override
    protected void exportar() {
        System.out.println("3. Guardando ventas.xlsx");
    }

    @Override
    protected boolean enviarPorEmail() {
        return true; // sobrescribe el hook
    }
}

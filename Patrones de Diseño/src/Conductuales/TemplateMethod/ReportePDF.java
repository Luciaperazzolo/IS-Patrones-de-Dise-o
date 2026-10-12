package Conductuales.TemplateMethod;

/**
 * CLASE CONCRETA: genera el reporte en formato PDF.
 * Solo completa los pasos que cambian; el orden lo decide Reporte.
 */
public class ReportePDF extends Reporte {

    @Override
    protected void formatear() {
        System.out.println("2. Formateando como PDF...");
    }

    @Override
    protected void exportar() {
        System.out.println("3. Guardando ventas.pdf");
    }
}

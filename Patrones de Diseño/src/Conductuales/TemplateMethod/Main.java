package Conductuales.TemplateMethod;

/**
 * CLIENTE: genera dos reportes distintos llamando siempre al mismo
 * método generar(). Los pasos se ejecutan en el mismo orden en ambos.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Reporte PDF ---");
        Reporte pdf = new ReportePDF();
        pdf.generar();

        System.out.println("\n--- Reporte Excel ---");
        Reporte excel = new ReporteExcel();
        excel.generar();
    }
}

package escenario2reportes;

/**
 * Fachada que simplifica el uso del sistema.
 * Permite generar un reporte completo en una sola llamada.
 */
public class FachadaReportes {

    private ConectorDB db;
    private LectorDeDatos lector;
    private ServicioWebAFIP afip;
    private ProcesadorDeImpuestos procesador;
    private RenderizadorPDF pdf;

    public FachadaReportes() {
        db = new ConectorDB();
        lector = new LectorDeDatos();
        afip = new ServicioWebAFIP();
        procesador = new ProcesadorDeImpuestos();
        pdf = new RenderizadorPDF();
    }

    public void generarReporteFiscal(String clienteId) {
        System.out.println("📘 Iniciando generación de reporte fiscal...\n");

        db.conectar();
        String cuit = lector.obtenerCUIT(clienteId);
        afip.autenticar();
        DatosFiscales datos = afip.obtenerDatosFiscales(cuit);
        float saldo = procesador.calcularSaldo(datos);
        pdf.generarPDF(cuit, saldo);
        db.desconectar();

        System.out.println("\n✅ Reporte generado exitosamente.");
    }
}


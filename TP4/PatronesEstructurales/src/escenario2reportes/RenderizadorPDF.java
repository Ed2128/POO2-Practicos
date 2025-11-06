package escenario2reportes;

public class RenderizadorPDF {

    public void generarPDF(String cuit, float saldo) {
        System.out.println("Generando reporte PDF...");
        System.out.println("--------------------------------");
        System.out.println("Reporte Fiscal del Cliente");
        System.out.println("CUIT: " + cuit);
        System.out.println("Saldo de Impuestos: $" + saldo);
        System.out.println("--------------------------------");
    }
}


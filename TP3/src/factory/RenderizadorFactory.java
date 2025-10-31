package factory;

//Factory que decide qué renderizador crear según el formato  solicitado
public class RenderizadorFactory {
    public static Renderizador crearRenderizador(String formato) {
        switch (formato.toUpperCase()) {
            case "PDF":
                return new RenderizadorPDF();
            case "EXCEL":
                return new RenderizadorExcel();
            case "CSV":
                return new RenderizadorCSV();
            default:
                throw new IllegalArgumentException("Formato no soportado: " + formato);
        }
    }
}

import singleton.*;
import builder.*;
import java.time.LocalDate;
import factory.*;
public class App {
    public static void main(String[] args){
        //Accedemos a la configuración global mediante el singleton
        GestorConfiguracion config = GestorConfiguracion.getInstancia();
        System.out.println("Conectando a BD: " + config.getUrlBd());
        System.out.println("Directorio de salida:" + config.getPathReportes());
    
    //Construimos un reporte utilizando el Builder
    Reporte reporte = new Reporte.ReporteBuilder("Informe de ventas", "Contenido principal del reporte.")
            .autor("Juancho Perez")
            .fecha(LocalDate.now())
            .pieDePagina("Página 1")
            .orientacion(Reporte.Orientacion.HORIZONTAL)
            .build();

        System.out.println("Reporte generado:" + reporte);

    //Creamos un renderizador utilizando la fábrica abstracta
    Renderizador renderizador = RenderizadorFactory.crearRenderizador("PDF");
    renderizador.renderizar(reporte.getCuerpoPrincipal());
  }  
}

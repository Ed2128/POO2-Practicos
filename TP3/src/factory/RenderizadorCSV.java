package factory;

public class RenderizadorCSV implements Renderizador {
    @Override
    public void renderizar(String contenido) {
        System.out.println("Renderizando contenido en formato CSV: " + contenido);
    }
    
}

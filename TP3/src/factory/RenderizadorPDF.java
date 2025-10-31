package factory;

public class RenderizadorPDF implements Renderizador {
    @Override
    public void renderizar(String contenido) {
        System.out.println("Renderizando contenido en formato PDF: " + contenido);
    }
    
}

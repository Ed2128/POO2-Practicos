package factory;

public class RenderizadorExcel implements Renderizador {
    @Override
    public void renderizar(String contenido) {
        System.out.println("Renderizando contenido en formato Excel: " + contenido);
    }
    
}

package escenario3adapter;
public class MainAdapter {
    public static void main(String[] args) {
        
        // Crear una instancia del adaptador.
        IServicioEnvio servicioEnvio = new LogisticaVelozAdapter();

        // Datos de prueba.
        String codigoPostal = "3300";
        String direccion = "Lavalle 5650";
        String idPedido = "12345";

        // Calcular costo de envío.
        float costo = servicioEnvio.calcularCosto(codigoPostal);
        System.out.println("Costo de envío: $" + costo);

        // Obtener tiempo estimado de entrega.
        String tiempoEstimado = servicioEnvio.obtenerTiempoEstimado(codigoPostal);
        System.out.println("Tiempo estimado de entrega: " + tiempoEstimado);

        // Despachar pedido.
        String idSeguimiento = servicioEnvio.despacharPedido(direccion, codigoPostal, idPedido);
        System.out.println("ID de seguimiento del pedido: " + idSeguimiento);
    }
}

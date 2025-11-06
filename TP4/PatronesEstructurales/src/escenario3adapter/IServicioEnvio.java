package escenario3adapter;

//Interfaz que define los métodos que el sistema espera para el servicio de envíos.
public interface IServicioEnvio {
    //Calcula el costo de envío basado en el código postal de destino.
    float calcularCosto(String codigoPostal);

    //Obtiene el tiempo estimado de entrega basado en el código postal de destino.
    String obtenerTiempoEstimado(String codigoPostal); 

    //Despacha un pedido y devuelve un identificador de seguimiento.
    String despacharPedido(String direccion, String codigoPostal, String idPedido); 
}

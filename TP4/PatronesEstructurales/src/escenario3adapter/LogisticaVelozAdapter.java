package escenario3adapter;
public class LogisticaVelozAdapter implements IServicioEnvio {

   //Instancia del proveedor externo.
     private ApiLogisticaVeloz apiVeloz;
    
      public LogisticaVelozAdapter() {
        this.apiVeloz = new ApiLogisticaVeloz();
    }

    @Override
    public float calcularCosto(String codigoPostal) {
        // Convertimos el código postal de String a int.
        int cp = Integer.parseInt(codigoPostal);

        // Usamos la API externa para obtener la cotización.
        Cotizacion cotizacion = apiVeloz.cotizarEnvio(cp);

         // Devolvemos solo el costo.
        return cotizacion.getCosto();
}   
    @Override
    public String obtenerTiempoEstimado(String codigoPostal) {
        // Convertimos el código postal de String a int.
        int cp = Integer.parseInt(codigoPostal);

        // Usamos la API externa para obtener la cotización.
        Cotizacion cotizacion = apiVeloz.cotizarEnvio(cp);

        // Devolvemos el tiempo estimado como String.
        return cotizacion.getDias() + " días";
    }

    @Override
    public String despacharPedido(String direccion, String codigoPostal, String idPedido) {

        // Convertimos el código postal de String a int.
         int cp = Integer.parseInt(codigoPostal);

        // Creamos el objeto que requiere la API externa.
        DatosEnvio datos = new DatosEnvio(direccion, cp, idPedido);

        // Enviamos el paquete mediante la API externa
        return apiVeloz.enviarPaquete(datos);
    }
}
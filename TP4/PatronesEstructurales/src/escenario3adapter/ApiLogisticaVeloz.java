package escenario3adapter;

//Clase de la librería externa
public class ApiLogisticaVeloz {

    //Método que cotiza el envío basado en el código postal de destino.
     public Cotizacion cotizarEnvio(int cpDestino) {
        //Simulación de cotización.
        return new Cotizacion(150.50f, 2);
    }

    //Método que envía el paquete y devuelve un ID de seguimiento.
     public String enviarPaquete(DatosEnvio datos) {
        return "AR-495384321";
    }
}

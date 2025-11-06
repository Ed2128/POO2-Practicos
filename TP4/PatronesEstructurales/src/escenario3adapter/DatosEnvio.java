package escenario3adapter;

//Clase que representa los datos necesarios para el envío
//La API de Logística Veloz utiliza esta clase para procesar envíos.
public class DatosEnvio {

     private String direccion;
     private int codigoPostal;
     private String idPedido;

     public DatosEnvio(String direccion, int codigoPostal, String idPedido) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.idPedido = idPedido;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public String getIdPedido() {
        return idPedido;
    }
}

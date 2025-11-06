package escenario3adapter;

//Clases auxiliares de la librería externa.
//Representa una cotización de envío, con su costo y días estimados.
public class Cotizacion {
    private float costo;
    private int dias;

    public Cotizacion(float costo, int dias) {
        this.costo = costo;
        this.dias = dias;
    }

     public float getCosto() {
        return costo;
    }

    public int getDias() {
        return dias;
    }
}

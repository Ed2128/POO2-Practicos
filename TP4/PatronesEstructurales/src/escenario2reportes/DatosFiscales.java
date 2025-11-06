package escenario2reportes;

public class DatosFiscales {
    private String cuit;
    private float ingresos;
    private float impuestosPagados;

    public DatosFiscales(String cuit, float ingresos, float impuestosPagados) {
        this.cuit = cuit;
        this.ingresos = ingresos;
        this.impuestosPagados = impuestosPagados;
    }

    public String getCuit() {
        return cuit;
    }

    public float getIngresos() {
        return ingresos;
    }

    public float getImpuestosPagados() {
        return impuestosPagados;
    }
}

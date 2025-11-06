package escenario1computadoras;


public class GarantiaExtendida extends DecoradorExtra {
    public GarantiaExtendida(Componente componente) {
        super(componente);
    }

    @Override
    public float getPrecio() {
        return componente.getPrecio() * 1.10f; // +10%
    }

    @Override
    public String getNombre() {
        return componente.getNombre() + " + Garantía Extendida";
    }
}


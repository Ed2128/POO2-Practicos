package escenario1computadoras;

public class ServicioInstalacion extends DecoradorExtra {
    public ServicioInstalacion(Componente componente) {
        super(componente);
    }

    @Override
    public float getPrecio() {
        return componente.getPrecio() + 50; // costo fijo
    }

    @Override
    public String getNombre() {
        return componente.getNombre() + " + Servicio de Instalación";
    }
}

package escenario1computadoras;

public abstract class DecoradorExtra implements Componente {
    protected Componente componente;

    public DecoradorExtra(Componente componente) {
        this.componente = componente;
    }

    @Override
    public String getNombre() {
        return componente.getNombre();
    }

    @Override
    public abstract float getPrecio();

    @Override
    public String toString() {
        return getNombre() + " ($" + getPrecio() + ")";
    }
}

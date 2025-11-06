package escenario1computadoras;
import java.util.ArrayList;
import java.util.List;

public class ComponenteCompuesto implements Componente {
    private String nombre;
    private float precioBase;
    private List<Componente> componentes = new ArrayList<>();

    public ComponenteCompuesto(String nombre, float precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public void agregar(Componente c) {
        componentes.add(c);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public float getPrecio() {
        float total = precioBase;
        for (Componente c : componentes) {
            total += c.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre + " ($" + precioBase + ")");
        for (Componente c : componentes) {
            sb.append("\n   - ").append(c.toString());
        }
        return sb.toString();
    }
}

package escenario1computadoras;

public class ComponenteSimple implements  Componente {
  private String nombre;
    private float precio;

    public ComponenteSimple(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }  
}

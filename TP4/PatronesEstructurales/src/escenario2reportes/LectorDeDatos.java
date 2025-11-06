package escenario2reportes;

public class LectorDeDatos {

    public String obtenerCUIT(String clienteId) {
        System.out.println("Obteniendo CUIT del cliente: " + clienteId);
        // Simulamos el CUIT desde la base de datos
        return "20-12345678-9";
    }
}


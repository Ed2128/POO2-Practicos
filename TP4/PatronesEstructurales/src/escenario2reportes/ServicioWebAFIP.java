package escenario2reportes;

public class ServicioWebAFIP {

    public void autenticar() {
        System.out.println(" Autenticando en el servicio web de AFIP...");
    }

    public DatosFiscales obtenerDatosFiscales(String cuit) {
        System.out.println("Obteniendo datos fiscales para CUIT: " + cuit);
        // Simulamos datos fiscales
        return new DatosFiscales(cuit, 150000, 25000);
    }
}

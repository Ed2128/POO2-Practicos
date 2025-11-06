package escenario1computadoras;



public class MainComputadora {
    public static void main(String[] args) {

        // Componentes simples
        CPU cpu = new CPU();
        MemoriaRAM ram1 = new MemoriaRAM();
        MemoriaRAM ram2 = new MemoriaRAM();
        DiscoSSD ssd = new DiscoSSD();

        // Placa madre que contiene CPU y RAMs
        PlacaMadre placaMadre = new PlacaMadre();
        placaMadre.agregar(cpu);
        placaMadre.agregar(ram1);
        placaMadre.agregar(ram2);

        // Gabinete que contiene la placa madre y el SSD
        Gabinete gabinete = new Gabinete();
        gabinete.agregar(placaMadre);
        gabinete.agregar(ssd);

        // Se agregan extras (decoradores)
        Componente gabineteConExtras = new GarantiaExtendida(new ServicioInstalacion(gabinete));

        System.out.println(" CONFIGURACIÓN DEL EQUIPO:");
        System.out.println(gabinete.toString());

        System.out.println("\n Precio base del equipo: $" + gabinete.getPrecio());
        System.out.println(" Precio con extras: $" + gabineteConExtras.getPrecio());
    }
}

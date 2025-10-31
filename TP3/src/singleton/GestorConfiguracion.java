package singleton;

public class GestorConfiguracion {
    //Instancia única de la clase
    private static GestorConfiguracion instancia;

    //Atributos globales
    private String urlBd;
    private String userBd;
    private String pathReportes;

    //Constructor privado para evitar instanciación externa
    private GestorConfiguracion(){
        this.urlBd = "jdbc:mysql://localhost/mi_app_db";
        this.userBd = "admin";
        this.pathReportes = "/var/app/reportes/";
        System.out.println("GestorConfiguracion inicializado con valores por defecto.");
    }

    //Método público para obtener la instancia única
    public static GestorConfiguracion getInstancia(){
        if(instancia == null){
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    //Getters para acceder a la configuración
    public String getUrlBd() {
        return urlBd;
    }
    public String getUserBd() {
        return userBd;
    }

    public String getPathReportes() {
        return pathReportes;
    }
}

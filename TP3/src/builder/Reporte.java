package builder;

import java.time.LocalDate;

public class Reporte {
    private final String titulo;
    private final String cuerpoPrincipal;
    private final String encabezado;
    private final String pieDePagina;
    private final LocalDate fecha;
    private final String autor;
    private final Orientacion orientacion;

    //Enumeracion para la orientacion del reporte
    public enum Orientacion {
        VERTICAL,
        HORIZONTAL
    }
    
    //Constructor privado que solo puede ser llamado desde el Builder
    private Reporte(ReporteBuilder builder) {
        this.titulo = builder.titulo;
        this.cuerpoPrincipal = builder.cuerpoPrincipal;
        this.encabezado = builder.encabezado;
        this.pieDePagina = builder.pieDePagina;
        this.fecha = builder.fecha;
        this.autor = builder.autor;
        this.orientacion = builder.orientacion;
    }

    //Clase interna estática para el Builder
    public static class ReporteBuilder {
        //Datos obligatorios
        private final String titulo;
        private final String cuerpoPrincipal;

        //Datos opcionales
        private String encabezado;
        private String pieDePagina;
        private LocalDate fecha;
        private String autor;
        private Orientacion orientacion = Orientacion.VERTICAL; // Valor por defecto

        public ReporteBuilder(String titulo, String cuerpoPrincipal) {
            this.titulo = titulo;
            this.cuerpoPrincipal = cuerpoPrincipal;
        }

        public ReporteBuilder encabezado(String encabezado) {
            this.encabezado = encabezado;
            return this;
        }

        public ReporteBuilder pieDePagina(String pieDePagina) {
            this.pieDePagina = pieDePagina;
            return this;
        }

        public ReporteBuilder fecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }

        public ReporteBuilder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public ReporteBuilder orientacion(Orientacion orientacion) {
            this.orientacion = orientacion;
            return this;
        }

        public Reporte build() {
            return new Reporte(this);
        }
    }
    @Override
    public String toString() {
        return "Reporte{" +
                "titulo='" + titulo + '\'' +
                ", cuerpoPrincipal='" + cuerpoPrincipal + '\'' +
                ", encabezado='" + encabezado + '\'' +
                ", pieDePagina='" + pieDePagina + '\'' +
                ", fecha=" + fecha +
                ", autor='" + autor + '\'' +
                ", orientacion=" + orientacion +
                '}';
    }
    public String getCuerpoPrincipal() {
        return cuerpoPrincipal;
    }
}
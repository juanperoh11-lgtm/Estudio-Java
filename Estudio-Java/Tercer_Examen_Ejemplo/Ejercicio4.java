public class Ejercicio4 {
    private String titulo;
    private String autor;
    private String isbn;
    private int anio;
    private String estado;
    private String edicion;

    public Ejercicio4(String titulo, String autor, String isbn, int anio, String estado, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anio = anio;
        this.estado = estado;
        this.edicion = edicion;
    }

    public boolean prestarLibro() {
        if ("DISPONIBLE".equals(this.estado) && !this.edicion.contains("Colección Especial")) {
            this.estado = "PRESTADO";
            return true;
        }
        return false;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro {" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Año=" + anio +
                ", Estado='" + estado + '\'' +
                ", Edición='" + edicion + '\'' +
                '}';
    }

    public String getIsbn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIsbn'");
    }
}
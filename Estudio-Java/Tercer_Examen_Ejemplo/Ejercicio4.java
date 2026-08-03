public class Ejercicio4 {
    private String titulo;
    private String autor;
    private String isbn;
    private int anyo;
    private String estado;
    private String edicion;

    public Ejercicio4(String tiutulo, String autor, String isbn, int anyo, String estado, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anyo = anyo;
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

    @Override
    public String toString() {
        return "Título: " + titulo +
                " - Autor: " + autor +
                " - ISBN: " + isbn +
                " - Año: " + anyo +
                " - Estado: " + estado +
                " - Edición: " + edicion;
    }
}
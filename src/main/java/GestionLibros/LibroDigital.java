package GestionLibros;


public class LibroDigital extends Libro{
    
    private String formato;

    public LibroDigital(String id, String titulo, String autor, int edicion, String isbn, String formato) {
        super(id, titulo, autor, edicion, isbn);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return super.toString() + ", Formato: " + formato;
    }
    
}

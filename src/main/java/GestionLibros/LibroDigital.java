package GestionLibros;


public class LibroDigital {
    
    private static final long serialVersionUID = 1L;
    private String formato;

    public LibroDigital(String titulo, String autor, String formato) {
        super(titulo, autor);
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

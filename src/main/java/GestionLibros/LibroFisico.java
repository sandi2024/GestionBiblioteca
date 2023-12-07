
package GestionLibros;


public class LibroFisico extends Libro{
    
    private int numeroCopias;

    public LibroFisico(String id, String titulo, String autor, int edicion, String isbn, int numeroCopias) {
        super(id, titulo, autor, edicion, isbn);
        this.numeroCopias = numeroCopias;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de copias: " + numeroCopias;
    }
}

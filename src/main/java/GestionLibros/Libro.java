
package GestionLibros;
import java.io.Serializable;

public abstract class Libro implements Serializable{
    
    private String id;
    protected String titulo;
    protected String autor;
    protected int edicion;
    protected String isbn;

    public Libro(String id, String titulo, String autor, int edicion, String isbn) {
        setId(id);
        setTitulo(titulo);
        setAutor(autor);
        setEdicion(edicion);
        setIsbn(isbn);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
   
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + " Edicion: " + edicion + "ISBN: " + isbn;
    }
    
}

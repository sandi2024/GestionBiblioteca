
package GestionLibros;

import java.io.*;

public class Libro{
    
    private String id;
    protected String titulo;
    protected String autor;
    protected String edicion;
    protected String isbn;
    protected String copia;

    public Libro(String id, String titulo, String autor, String edicion, String isbn, String copia) {
        setId(id);
        setTitulo(titulo);
        setAutor(autor);
        setEdicion(edicion);
        setIsbn(isbn);
        setCopia(copia);
    }
    
    public Libro() {
       
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

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getCopia() {
        return copia;
    }

    public void setCopia(String copia) {
        this.copia = copia;
    }
   
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + " Edicion: " + edicion + "ISBN: " + isbn + "Copia: " + copia;
    }
    
}

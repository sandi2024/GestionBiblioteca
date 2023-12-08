
package GestionLibros;

import java.io.*;

public class Libro{
    
    private String id;
    protected String titulo;
    protected String autor;
    protected int edicion;
    protected String isbn;
    protected int copia;

    public Libro(String id, String titulo, String autor, int edicion, String isbn, int copia) {
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
    
    public int getCopia() {
        return copia;
    }

    public void setCopia(int copia) {
        this.copia = copia;
    }
   
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + " Edicion: " + edicion + "ISBN: " + isbn;
    }
    
}

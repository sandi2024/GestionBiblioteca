
package GestionLibros;

import java.awt.List;
import java.io.FileInputStream;
import java.io.*;
import java.util.*;

/**
 *
 * @author user
 */
public class MetodosB {
   
    public ArrayList<Libro> libros;

    public MetodosB() {
        libros = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Libro> buscarLibrosPorAutor(String autor) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.autor.equalsIgnoreCase(autor)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public ArrayList<Libro> buscarLibrosPorTitulo(String titulo) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public void guardarLibros(Libro libro) {
        try {
            FileOutputStream archivo = new FileOutputStream("Libros.dat");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            escritura.writeObject(libro);
            System.out.println("Libro guardados correctamente en el archivo " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 //   public void cargarLibros(String archivo) {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
  //          libros = (List<Libro>) ois.readObject();
  //          System.out.println("Libros cargados correctamente desde el archivo " + archivo);
   //     } catch (IOException | ClassNotFoundException e) {
  //          e.printStackTrace();
  //      }
}
    


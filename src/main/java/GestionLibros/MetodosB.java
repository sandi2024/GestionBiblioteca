
package GestionLibros;

import java.awt.List;
import java.io.FileInputStream;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MetodosB {
   
    Vector libros = new Vector();
   

  //  public MetodosB() {
   //     libros = new libro<>();
  //  }

    public void registrarLibro(Libro unLibro) {
        libros.addElement(unLibro); 
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public Vector getLibros() {
        return libros;
    }

  //  public ArrayList<Libro> buscarLibrosPorAutor(String autor) {
   //     ArrayList<Libro> librosEncontrados = new ArrayList<>();
   //     for (Object libro : libros) {
   //         if (libro.autor.equalsIgnoreCase(autor)) {
   //             librosEncontrados.add((Libro) libro);
  //          }
   //     }
  //      return librosEncontrados;
  //  }

 //   public ArrayList<Libro> buscarLibrosPorFolio(String folio) {
 //       ArrayList<Libro> librosEncontrados = new ArrayList<>();
 //       for (Libro libro : libros) {
 //           if (libro.titulo.equalsIgnoreCase(folio)) {
  //              librosEncontrados.add(libro);
  //          }
 //       }
 //       return librosEncontrados;
 //  }

    public void guardarLibros(Libro libro) {
        try {
            FileOutputStream archivo = new FileOutputStream("Libros.dat");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            escritura.writeObject(libro);
            JOptionPane.showMessageDialog(null,"Registro exitoso");
            escritura.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 //   public void cargarLibros() {
 //       try {
 ///           FileInputStream archivo = new FileInputStream("Libros.dat");
 //           ObjectInputStream lectura = new ObjectInputStream(archivo);
//             libros = (List<Libro>) lectura.readObject();
 //           System.out.println("Libros cargados correctamente desde el archivo " + archivo);
            
  //         } catch (IOException | ClassNotFoundException e) {
  //          e.printStackTrace();
  //         }
  //  }
}
    


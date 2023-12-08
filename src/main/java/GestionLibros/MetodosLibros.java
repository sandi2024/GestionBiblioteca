package GestionLibros;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MetodosLibros {
    
    Vector vLibros = new Vector();

 
    public void Guardar(Libro unLibro){
        
        vLibros.addElement(unLibro); 
    }
    
    public void guardarArchivo(Libro libro) throws IOException{

        try{
           FileWriter fw = new FileWriter("Libros.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(libro.getTitulo());
            pw.print("|"+libro.getAutor());
            pw.print("|"+libro.getEdicion());
            pw.print("|"+libro.getIsbn());
            pw.println("|"+libro.getId());
            pw.print("|"+libro.getCopia());
            fw.close();   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    }
    
    public DefaultTableModel listaLibros(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Titulo");
        cabeceras.addElement("Autor");
        cabeceras.addElement("Edicion");
        cabeceras.addElement("ISBN");
        cabeceras.addElement("FOLIO");
        cabeceras.addElement("COPIAS");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try{
            FileReader fr = new FileReader("Libros.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
        return mdlTabla;
    }
    
}

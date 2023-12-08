package GestionUsuario;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Metodos {
    
    Vector vDatos = new Vector();

 
    public void Guardar(Usuario unUsuario){
        
        vDatos.addElement(unUsuario); 
    }
    
    public void guardarArchivo(Usuario usuario) throws IOException{
//        FileWriter archivo = null;
//        PrintWriter pw = null;
        
        try{
           FileWriter fw = new FileWriter("Usuarios.txt",true);
     //      fw.write(usuario.getNombre()+"|"+usuario.getCorreo()+"|"+usuario.getTelefono()+"+"+usuario.getCodigo()+"|"+usuario.getContraseña()+"\r\n");
      //      BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(usuario.getNombre());
            pw.print("|"+usuario.getCorreo());
            pw.print("|"+usuario.getTelefono());
            pw.print("|"+usuario.getCodigo());
            pw.println("|"+usuario.getPassword());
            fw.close();   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    }
    
    public DefaultTableModel listaUsuario(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Correo");
        cabeceras.addElement("Telefono");
        cabeceras.addElement("ID_Usuario");
        cabeceras.addElement("Contrase;a");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try{
            FileReader fr = new FileReader("Usuarios.txt");
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
    


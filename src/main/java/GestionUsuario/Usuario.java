
package GestionUsuario;

public class Usuario{
    
    protected String nombre;
    protected String correo;
    protected String telefono;
    private String codigo;
    private String password;

//Metodo constructor con parametros
    public Usuario(String nombre, String correo, String telefono, String codigo, String password){
	setNombre(nombre);
	setCorreo(correo);
	setTelefono(telefono);
	setCodigo(codigo);
        setPassword(password);
    }
    
//Metodo constructor sin parametros    
    public Usuario(){
        setNombre(nombre);
	setCorreo(correo);
	setTelefono(telefono);
	setCodigo(codigo);
        setPassword(password);
    }


//Metodos set y get
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    public String getNombre(){
	return nombre;
    }
	
    public void setCorreo(String correo){
	this.correo = correo;
    }
    public String getCorreo(){
	return correo;
    }

    public void setTelefono(String telefono){
	this.telefono = telefono;
    }
    public String getTelefono(){
	return telefono;
    }
  
    public void setCodigo(String codigo){
	this.codigo = codigo;
    }
    public String getCodigo(){
	return codigo;
    }
    
    public void setPassword(String password){
	this.password = password;
    }
    public String getPassword(){
	return password;
    }
    
 //   public abstract void realizarAccion();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correo + ", Telefono: " + telefono;
    }


    
}

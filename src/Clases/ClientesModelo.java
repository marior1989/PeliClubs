/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Ruben
 */
public class ClientesModelo {
    String ci;
    String Nombre;
    String Apellido;
    String Direccion;
    String Telefono;
    String Correo;
    String Tipo;
    String Sexo;
    
    public ClientesModelo(String ci,String Nombre, String Apellido, String Direccion, String Telefono, String Correo, String Tipo,String Sexo){
        this.ci=ci;
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.Direccion= Direccion;
        this.Telefono=Telefono;
        this.Correo= Correo;
        this.Tipo= Tipo;
        this.Sexo= Sexo;     
    }
   public String getci(){
      return ci; 
   }  
   public void setci(String ci){
       this.ci=ci;
   }
   public String getNombre(){
       return Nombre;
   }
   public void setNombre(String Nombre){
       this.Nombre= Nombre;
       
   }
   public String getApellido(){
       return Apellido;
   }
   public void setApellido(String Apellido){
       this.Apellido= Apellido;
   }
   public String getDireccion(){
       return Direccion;
   }
   public void setDireccion(String Direccion){
       this.Direccion= Direccion;
   }
   public String getTelefono(){
       return Telefono;
   }
   public void setTelefono(String Telefono){
       this.Telefono= Telefono;
   }
   public String getCorreo(){
       return Correo;
   }
   public void setCorreo(String Correo){
       this.Correo= Correo;
   }
   public String getTipo(){
       return Tipo;
   }
   public void setTipo(String Tipo){
       this.Tipo= Tipo;
   }
   public String getSexo(){
       return Sexo;
   }
   public void setSexo( String Sexo){
       this.Sexo= Sexo;
   }
}

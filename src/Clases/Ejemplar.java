/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.InputStream;

/**
 *
 * @author Ruben
 */
public class Ejemplar {
    private int idEjemplar;
    private int CodigoPelicula;
    private String Peliculas;
    private String Genero;
    private String Formato;
    private int PrecioAlquiler;
    private int PrecioVenta;
    private String stock;
    private String Estado;
    private InputStream foto;
        public Ejemplar(int idEjemplar,int CodigoPelicula, String Peliculas, String Genero, String Formato, int PrecioAlquiler,String stock, int PrecioVenta, String Estado, InputStream foto){
           this.idEjemplar= idEjemplar;
           this.CodigoPelicula=CodigoPelicula;
           this.Formato= Formato;
           this.Genero= Genero;
           this.Peliculas= Peliculas;
           this.PrecioAlquiler= PrecioAlquiler;
           this.PrecioVenta= PrecioVenta;
           this.stock= stock;
           this.Estado= Estado;
           this.foto= foto;
        }
        public String getStock(){
            return stock;
        }
        public void setStock(String stock){
            this.stock= stock;
        }
        public int getidEjemplar(){
            return idEjemplar;
        }
        public void setidEjemplar(int idEjemplar){
            this.idEjemplar= idEjemplar;
        }
         public int getCodigoPelicula(){
            return CodigoPelicula;
        }
        public void setCodigoPelicula(int CodigoPelicula){
            this.CodigoPelicula= CodigoPelicula;
        }
        public String getPeliculas(){
            return Peliculas;
        }
        public void setPeliculas(String Peliculas){
            this.Peliculas= Peliculas;
        }
        public String getGenero(){
            return Genero;
        }
        public void setGenero(String Genero){
            this.Genero= Genero;
        }
        public String getFormato(){
            return Formato;
        }
        public void setFormato(String Formato){
            this.Formato= Formato;
        }
        public int getPrecioAlquiler(){
            return PrecioAlquiler;
        }
        public void setPrecioAlquiler(int PrecioAlquiler){
            this.PrecioAlquiler= PrecioAlquiler;
        }
         public int getPrecioVenta(){
            return PrecioVenta;
        }
        public void setPrecioVenta(int PrecioVenta){
            this.PrecioAlquiler= PrecioVenta;
        }
        public String getEstado(){
            return Estado;
        }
        public void setEstado(String Estado){
            this.Estado = Estado;
        }
        public InputStream getFoto(){
            return foto;
        }
        public void setFoto(InputStream foto){
            this.foto= foto;
        }
        
        
}

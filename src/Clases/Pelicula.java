package Clases;

import java.io.InputStream;

public class Pelicula {

    private int  id;
    private String  titulo;
    private String  duracion;
    private String  pais;
    private String  director;
    private String  actores;
    private String  sinopsis;
    private String   genero;
    private Integer stock;
    private InputStream imagen;
    public Pelicula(int id, String titulo, String duracion, String pais, String director, String actores, String sinopsis, String genero,Integer stock , InputStream imagen) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.pais = pais;
        this.director = director;
        this.actores = actores;
        this.sinopsis=sinopsis;
        this.genero = genero;
        this.stock=stock;
        this.imagen=imagen;
    }

    public Pelicula(String titulo, String duracion, String pais, String director, String actores,String sinopsis, String genero, Integer stock, InputStream imagen) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.pais = pais;
        this.director = director;
        this.actores = actores;
        this.sinopsis=sinopsis;
        this.genero = genero;
        this.stock=stock;
        this.imagen=imagen;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
     public InputStream getImagen(){
        return imagen;
    }
    public void setImagen(InputStream imagen){
        this.imagen= imagen;
    }
    
   
    
}

package Clases;


public class Genero {
    private Integer id;
    private String  descripcion;
    

    public Genero(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }   
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }       
    
}

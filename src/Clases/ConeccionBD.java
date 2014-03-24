package Clases;

import Programas.ActualizarPelicula;
import Programas.Cliente;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ConeccionBD {
private Pelicula Pelicula;
    private ArrayList<Pelicula> ListaPelicula;
    private ArrayList<Ejemplar> ListaEjemplar;
    private Genero genero;
    private Ejemplar Ejemplar;
    private ClientesModelo cliente;;
    
    String cod;
    public final String CONTROLADOR_JDBC = "com.mysql.jdbc.Driver";
    //public final String CONTROLADOR_JDBC = "org.postgresql.Driver";
    /** La conexion con la base de datos */
   
    private Connection conexion = null;
    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;
    String codigo, fecha;
   
    /** Creates a new instance of ConeccionBD */
    public ConeccionBD() {
        ListaPelicula= new ArrayList<Pelicula>();
        ListaEjemplar= new ArrayList<Ejemplar>();
    }
    public boolean estaConectado() {

        if (conexion != null) {
            return true;
        }
        try {
            // Se registra el Driver de MySQL

             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName(CONTROLADOR_JDBC);
// Se obtiene una conexi�n con la base de datos. Hay que
// cambiar el usuario "usuario" y la clave "" por las
// adecuadas a la base de datos que estemos usando.
     // conexion  = DriverManager.getConnection("jdbc:postgresql://localhost/compras", "postgres", "123");
//para conectar a mysql
            
            conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost/video_club1", "root", "1234");
            //"jdbc:mysql://localhost/rrhh","root","");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Connection conectar(){
        try {
              Class.forName(CONTROLADOR_JDBC);
               
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/video_club1", "root", "1234");
 //  conexion  = DriverManager.getConnection("jdbc:postgresql://localhost/compras", "postgres", "123");
        } catch (Exception e) {
        }
      return conexion;
    }




    public boolean borrarRegistro(String tabla, String condicion) {
        int resultado;
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            // Se realiza la consulta. 
            JOptionPane optionPane = new JOptionPane();
            Object[] opciones = {"S�", "No"};
            //Dialogo modal SI_NO
            int ret = optionPane.showOptionDialog(null, "Desea Borrar? ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            //Si la opcion escogida es Si
            if (ret == JOptionPane.YES_OPTION) {
                resultado = s.executeUpdate("delete from " + tabla + " where " + condicion);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error", "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean existetituloPelicula(String Titulo){
      boolean existe= false;
        ConeccionBD z = new ConeccionBD();
            Connection cn = z.conectar();
            String sql = "SELECT tituloPelicula from peliculas ";  
            try {
             Statement st = cn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()){
                    String bd_titulo= rs.getString("tituloPelicula");
                    if( Titulo.equals(bd_titulo)){
                        existe= true;
                    }
                }
        } catch (Exception e) {
        }
            return existe;
    }

    public boolean borrarRegistroSinPreguntar(String tabla, String condicion) {
        int resultado;
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            resultado = s.executeUpdate("delete from " + tabla + " where " + condicion);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertarRegistro(String tabla, String campos, String valores) {
        int resultado;
        conectar();
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            // Se realiza la consulta. 
            resultado = s.executeUpdate("insert into " + tabla + " (" + campos + ") values (" + valores + ")");
           // JOptionPane.showMessageDialog(null, "Grabado con exito");

        } catch (Exception e) {
            //e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Ocurrio Un error\n" + e.getMessage(), "Atencion",
                   JOptionPane.INFORMATION_MESSAGE);
            System.out.println("insert into " + tabla + " (" + campos + ") values (" + valores + ")");
            return false;
        }
        return true;
    }
public boolean existeCedulaCliente(String CI) {
        boolean existe = false;
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
            } catch (IllegalAccessException ex) {
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost/video_club1", "root", "1234");
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery("SELECT * FROM clientes");

                while (res.next()) {
                    String ci_bd = res.getString("ci_cliente");
                    
                    if (CI.equals(ci_bd)) {
                        System.out.println(ci_bd);
                        existe = true;
                    }
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return existe;
    }

public  int GrabarRegistroconImagen(String idPeliculas, int idGenero, String tituloPelicula, String PaisPelicula, String duracionPelicula, String directorPelicula, String ActoresPelicula, String SinopsisPelicula, 
        int StockPelicula, FileInputStream peliculaImagen, int longitud,int cantidadDVD, int cantidadBluray){
    int rsu=0;
    conectar();
    
    
             
            if(conexion!=null){
        
              String sql = "CALL spcargarPelicula_Ejemplar(?,?,?,?,?,?,?,?,?,?,?,?);";  
        try {
            ps= conexion.prepareCall(sql);
             ps.setString(1, idPeliculas);
              ps.setInt(2, idGenero);
              ps.setString(3, tituloPelicula);
              ps.setString(4, PaisPelicula);
              ps.setString(5, duracionPelicula);
              ps.setString(6, directorPelicula);
              ps.setString(7, ActoresPelicula);
              ps.setString(8, SinopsisPelicula);
              ps.setInt(9, StockPelicula);
              ps.setBlob(10,peliculaImagen, longitud);
              ps.setInt(11, cantidadDVD);
              ps.setInt(12, cantidadBluray);
              rsu= ps.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
             
              
              
                
         
            }
     
    return rsu;
}
public  int GrabarEjemplar(int idPeliculas,String Formato, int StockPelicula, int CantidadAgregar){
    int rsu=0;
    conectar();
    
    
             
            if(conexion!=null){
        
              String sql = "CALL spCargarEjemplar(?,?,?,?);";  
        try {
            ps= conexion.prepareCall(sql);
             ps.setInt(1, idPeliculas);
              ps.setString(2, Formato);
              ps.setInt(3, StockPelicula);
              ps.setInt(4, CantidadAgregar);
              
              rsu= ps.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
             
              
              
                
         
            }
     
    return rsu;
}
public  int GrabarEjemplar( String idPelicula, String formato, String Estado, int precioAlquiler, int precioVenta){
    int rsu=0;
    conectar();
    
    
    
             
            if(conexion!=null){
        
              String sql = "INSERT INTO ejemplar (idPeliculas, FormatoEjemplar, PrecioAlquilerEjemplar, EstadoEjemplar,PrecioVentaEjemplar)"
                      + " VALUES (?,?,?,?,?);";  
        try {
            ps= conexion.prepareStatement(sql);
             ps.setString(1, idPelicula);
              ps.setString(2, formato);
              ps.setInt(3, precioAlquiler);
              ps.setString(4, Estado);
              ps.setInt(5, precioVenta);
              rsu= ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
             
              
              
                
         
            }
     
    return rsu;
}
public  int ActualizarRegistroconImagen(String idPeliculas, int idGenero, String tituloPelicula, String PaisPelicula, String duracionPelicula, String directorPelicula, String ActoresPelicula, String SinopsisPelicula, String StockPelicula, FileInputStream peliculaImagen, int longitud){
    int rsu=0;
    conectar();
    
    
             
            if(conexion!=null){
        
              String sql = "Update  peliculas  set "
                      + "idGenero = ?,"
                      + "tituloPelicula= ?,"
                      + "PaisPelicula= ?,"
                      + "duracionPelicula= ?,"
                      + "directorPelicula= ?,"
                      + "ActoresPelicula= ?,"
                      + "SinopsiPelicula= ?,"
                      + "StockPelicula= ?,"
                      + "peliculaImagen= ? where idPeliculas=? ;";  
        try {
            ps= conexion.prepareStatement(sql);
             ps.setInt(1, idGenero);
              ps.setString(2, tituloPelicula);
              ps.setString(3, PaisPelicula);
              ps.setString(4, duracionPelicula);
              ps.setString(5, directorPelicula);
              ps.setString(6, ActoresPelicula);
              ps.setString(7, SinopsisPelicula);
              ps.setString(8, StockPelicula);
              ps.setBlob(9, peliculaImagen, longitud);
              ps.setString(10,idPeliculas);
              rsu= ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
             
              
              
                
         
            }
     
    return rsu;
}
public ArrayList<Pelicula>  verDatos(){
     ListaPelicula.clear();
     int i=0;
        ConeccionBD z = new ConeccionBD();
            Connection cn = z.conectar();
            String sql = "SELECT *FROM vpeliculas ";
            try {
                Statement st = cn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    
                    int Codigo = rs.getInt("Codigo");
                    String titulo = rs.getString("Titulo");
                    String duracion = rs.getString("Duracion");
                    String pais = rs.getString("Pais");
                    String director = rs.getString("Director");
                    String actores = rs.getString("Actores");
                    String sinopsis = rs.getString("Sinopsis");
                    String Genero = rs.getString("Genero");
                    int stock = rs.getInt("Stock");
                    InputStream imagen= rs.getBinaryStream("Foto");
   Pelicula= new Pelicula(Codigo, titulo,duracion, pais, director, actores, sinopsis, Genero, stock, imagen);
                     ListaPelicula.add(i, Pelicula);   
                     i++;
           
              }


                   


            } catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            return ListaPelicula;
      }

public ArrayList<Ejemplar> ListarEjemplares(String Peliculas){
    ListaEjemplar.clear();
    int i=0;
        ConeccionBD z = new ConeccionBD();
            Connection cn = z.conectar();
            String sql = "SELECT *FROM vejemplar where Titulo= '"+Peliculas+"' "
                    + "and Estado= 'LIBRE' ";
            try {
                Statement st= cn.createStatement();
                rs= st.executeQuery(sql);
                while(rs.next()){
                    int idEjemplar= rs.getInt("Codigo");
                    int codiPeli= rs.getInt("CodigoPelicula");
                    String peli= rs.getString("Titulo");
                    String Gene= rs.getString("Genero");
                    String formato = rs.getString("Formato");
                    int PrecioAlquiler= rs.getInt("PrecioAlquiler");
                    int PrecioVenta= rs.getInt("PrecioVenta");
                    String Stock= rs.getString("Stock");
                    String Estado= rs.getString("Estado");
                    InputStream foto= rs.getBinaryStream("Foto");
                    Ejemplar = new Ejemplar(idEjemplar,codiPeli, peli, Gene, formato, PrecioAlquiler,Stock,  PrecioVenta, Estado, foto);
                    ListaEjemplar.add(i, Ejemplar);
                    i++;
                }
    } catch (Exception e) {
         Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, e);
    }
            return ListaEjemplar;
}

public  ArrayList<Pelicula> BusquedaPorGenero(Pelicula genero){
    ListaPelicula.clear();
        ConeccionBD z = new ConeccionBD();
            Connection cn = z.conectar();
           int i= 1;
            String sql = "SELECT *FROM vpeliculas WHERE Genero ='"+Pelicula.getGenero()+"'";
            try {
                Statement st = cn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    
                    int vcodigo = rs.getInt("Codigo");
                    String vtitulo = rs.getString("Titulo");
                    String vduracion = rs.getString("Duracion");
                    String vorigen = rs.getString("Pais");
                    String vdirector = rs.getString("Director");
                   String  vactores = rs.getString("Actores");
                   String  vsinopsis = rs.getString("Sinopsis");
                   String  vgenero = rs.getString("Genero");
                   int   vstock = rs.getInt("Stock");
                   InputStream imagen= rs.getBinaryStream("Foto");
                    Pelicula= new Pelicula(vcodigo, vtitulo,vduracion, vorigen, vdirector, vactores, vsinopsis, vgenero, vstock, imagen);
                     ListaPelicula.add(i, Pelicula);   
                     i++;
                }

            } catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            return ListaPelicula;
      }
    public boolean actualizarRegistro(String tabla, String campos, String criterio) {
        int resultado;
        conectar();
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            // Se realiza la consulta. 
            resultado = s.executeUpdate("update " + tabla + " set " + campos + " where " + criterio);
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error\n" + e.getMessage(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
           System.out.println("update " + tabla + " set " + campos + " where " + criterio);
            return false;
        }
        return true;
    }

    public ResultSet dameLista(String campos, String tabla, String condicion) {
        ResultSet rs = null;
        conectar();
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select " + campos + " from " + tabla + " " + condicion);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error", "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("select " + campos + " from " + tabla + " " + condicion);
        }
        return rs;
    }

    public ResultSet dameLista(String sql) {
        ResultSet rs = null;
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error", "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println(sql);
        }
        return rs;
    }

    public void cargarCombo(String sql, JComboBox combo) {
        ResultSet rs = null;
        int contar = 0;
        try {
            Statement s = conexion.createStatement();
            rs = s.executeQuery(sql);
            while (rs.next()) {
                String columnas[] = new String[2];
                columnas[0] = rs.getString(1);
                columnas[1] = rs.getString(2);
                
                combo.addItem(columnas);
                System.out.println(rs.getString(1) + "-" + rs.getString(2));
                contar++;
            }
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error: " + e.toString(), "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (contar > 0) {
            combo.setRenderer(new DefaultListCellRenderer() {

                public java.awt.Component getListCellRendererComponent(
                        JList l, Object o, int i, boolean s, boolean f) {
                    try {
                        return new JLabel(((String[]) o)[1]);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ocurrio Un error", "Atencion",
                                JOptionPane.INFORMATION_MESSAGE);
                        return null;
                    }
                }
            });
        }
        return;
    }
public boolean existeUsuarioClave(String usu, String clave) {

        ResultSet rs = null;
        try {


            Statement s = conexion.createStatement();
            rs = s.executeQuery("select count(1) from usuario where Login = '" + usu + "' and Contrasena = '" + clave + "'");
            JOptionPane.showMessageDialog(null, "Conectado" + rs, "Bienvenidos",
                    JOptionPane.INFORMATION_MESSAGE);
            //rs = s.executeQuery("select count(1) from usuario where usuario = 'usu' and clave = 'clave'");

            rs.next();
            int cantidad = rs.getInt(1);

            if (cantidad == 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
Genero obtenerGeneroPorId(Integer idGenero) {
        Connection conn = null;
        try {
             try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
            } catch (IllegalAccessException ex) {
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost/video_club1", "root", "1234");
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery("SELECT * FROM genero where idGenero=" + idGenero);

                while (res.next()) {
                    Integer id = res.getInt("idGenero");
                    String descripcion = res.getString("descripciongenero");


                    genero = new Genero(id, descripcion);
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return genero;
    }

public Genero buscarGenero(Integer idGenero) {

        return obtenerGeneroPorId(idGenero);
    }

    
public String traerfecha(){
     try {
            stmt = conexion.createStatement();
            String consultaSQL = ("select current_date() as fecha");
            rs = stmt.executeQuery(consultaSQL);
            while (rs.next()) {
                fecha = rs.getString("fecha");
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return fecha;
    }





    
    /** Cierra la conexi�n con la base de datos */
    public void cierraConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

   

   
    

   
}

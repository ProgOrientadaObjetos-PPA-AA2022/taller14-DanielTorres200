/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sueldotrabajadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author spart
 */
public class Enlace {

    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/baseDatos.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }          
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador trabajador) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO sueldoTrabajadores (cedula, "
                    + "nombres, sueldo, mesSueldo, correo) "
                    + "values ('%s','%s','%.2f','%s','%s')", 
                    trabajador.obtenerCedula(), 
                    trabajador.obtenerNombre(),
                    trabajador.obtenerSueldo(), 
                    trabajador.obtenerMesSueldo(),
                    trabajador.obtenerCorreo());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataTrabajador() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from sueldoTrabajadores;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador miTrabajador = new Trabajador(rs.getString("cedula"),
                rs.getString("nombres"), rs.getString("correo"),
                rs.getDouble("sueldo"),rs.getString("mesSueldo"));
                lista.add(miTrabajador);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
}

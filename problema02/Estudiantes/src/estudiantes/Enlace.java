/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiantes;

import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
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
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            //System.out.println(conn.isClosed());
            //System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarEstudiantes(Estudiantes estudiante) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + "apellido,calificacion1,calificacion2,calificacion3) "
                    + "values ('%s', '%s', '%.2f','%.2f','%.2f')",
                    estudiante.obtenerNombre(),
                    estudiante.obtenerApellido(),
                    estudiante.obtenerCalificacion1(), 
                    estudiante.obtenerCalificacion2(), 
                    estudiante.obtenerCalificacion3());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Estudiantes> obtenerDataEstudiante() {
        ArrayList<Estudiantes> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                
                Estudiantes e = new Estudiantes(rs.getString("nombre"),
                rs.getString("apellido"), rs.getDouble("calificacion1"),
                rs.getDouble("calificacion2"),rs.getDouble("calificacion3"));
                
                lista.add(e);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarEstudiante");
            System.out.println(e.getMessage());
        }
        return lista;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author POINT
 */
public class Conexion {
    Connection con;
    
    public Conexion(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_licoreria", "GuillermoG","basededatosmsql");
        } catch (Exception e) {
           System.err.println("No se pudo establecer conexion con la base de datos. Error"+e);     
               
        }
    }
        public static void main(String[] args) {
        Conexion cn=new Conexion();
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

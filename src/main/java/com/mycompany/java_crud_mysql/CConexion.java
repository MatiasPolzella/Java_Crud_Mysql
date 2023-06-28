package com.mycompany.java_crud_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MATIAS
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "123456";
    String bd = "bdescuela";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection estableceConexion () {
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null,"La conexion ha sido realizada con exito");
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos, error: " +  e.toString());
        }
        return conectar;
    }
    
}

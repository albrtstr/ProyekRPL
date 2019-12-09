/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author M S I
 */
public class DataBaseConnection {
    private String jdbcURL = "jdbc:oracle:thin:@172.23.9.185:1521:orcl";
    private String user = "MHS185314105";
    private String password = "MHS185314105";
    private Connection connection = null;
    
    public DataBaseConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("Koneksi Berhasil!!!");
        } catch (Exception ex){
            System.out.println("message: " +ex.getMessage());
        }
    }
    
    public boolean isConnected(){
        if (connection != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean getClosed(){
        if (isConnected()) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException ex){
                ex.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public static void main (String[] args){
        DataBaseConnection database = new DataBaseConnection();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadwalmapel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Dell
 */
public class koneksi {
    private static Connection mysqlkoneksi;
    public static Connection koneksi()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/jadwal"; //url database
            String user = "root"; //user database
            String pass = ""; //password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlkoneksi = DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("Koneksi Gagal : "+e.getMessage()); // perintah menampilkan error pada koneksi
        }
        return mysqlkoneksi;
    }    
}

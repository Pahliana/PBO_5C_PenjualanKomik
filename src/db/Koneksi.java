
package db;

import frame.home.homeFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    private final String URL = "jdbc:mysql://localhost:3306/db_komik";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection getConnection(){
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Koneksi Berhasil");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Koneksi gagal");
            return con=null;
        }
    }
    
    public static void main(String[] args) {
        
        Koneksi kon = new Koneksi();
        kon.getConnection();
        
        homeFrame homeFrame = new homeFrame();
        homeFrame.setVisible(true);

    }
}

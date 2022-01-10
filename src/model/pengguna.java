/*
 * BELUM SELESAI LOGIN (ERROR)
 */
package model;

import db.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class pengguna {
     private int id;
    private String username;
    private String password;
    private String namalengkap;
    private boolean isadmin;
    
    private Koneksi kon;
    private Connection connection;
    
    
    public boolean login(){
        
        String loginSql = "SELECT * FROM pengguna WHERE username = ? AND password = MD5(?)";
        
        this.kon = new Koneksi();
        this.connection = this.kon.getConnection();
         try {
             PreparedStatement preparedStatement = this.connection.prepareStatement(loginSql);
             preparedStatement.setString(1, this.username);
             preparedStatement.setString(2, this.password);
             
             ResultSet resultSet = preparedStatement.executeQuery();
             while(resultSet.next()){
                 this.id = resultSet.getInt("id");
                 this.namalengkap = resultSet.getString("nama_lengkap");
                 this.isadmin = resultSet.getBoolean("isadmin");
                 return true;
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public Koneksi getKon() {
        return kon;
    }

    public void setKon(Koneksi kon) {
        this.kon = kon;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    
    
    
}

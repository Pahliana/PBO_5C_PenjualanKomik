/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Blob;

/**
 *
 * @author asus
 */
public class admin {
   String id;
    String id_komik;
    String nama_komik;
    String genre_komik;
    String harga_komik; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_komik() {
        return id_komik;
    }

    public void setId_komik(String id_komik) {
        this.id_komik = id_komik;
    }

    public String getNama_komik() {
        return nama_komik;
    }

    public void setNama_komik(String nama_komik) {
        this.nama_komik = nama_komik;
    }

    public String getGenre_komik() {
        return genre_komik;
    }

    public void setGenre_komik(String genre_komik) {
        this.genre_komik = genre_komik;
    }

    public String getHarga_komik() {
        return harga_komik;
    }

    public void setHarga_komik(String harga_komik) {
        this.harga_komik = harga_komik;
    }
    
    public admin() {
    }

    public admin(String id, String id_komik, String nama_komik, String genre_komik, String harga_komik) {
        this.id = id;
        this.id_komik = id_komik;
        this.nama_komik = nama_komik;
        this.genre_komik = genre_komik;
        this.harga_komik = harga_komik;
    }
}

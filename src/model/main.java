/*
 * BELUM SELESAI LOGIN (ERROR)
 */
package model;

import frame.home.homeFrame;
import model.pengguna;


/**
 *
 * @author asus
 */
public class main {
    public static void main(String[] args){
       pengguna pg = new pengguna();
       pg.setUsername("admin");
       pg.setPassword("admin");
       
       homeFrame hf = new homeFrame();
                hf.setVisible(true);
        
       /**if(pg.login()){
           System.out.println(pg.getNamalengkap());
           System.out.println(pg.isIsadmin());
           
       }else{
           System.out.println("Gagal");
       }
             
   */ }
}

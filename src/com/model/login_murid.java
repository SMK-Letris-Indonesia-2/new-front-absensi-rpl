/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;
import com.controller.controller_loginmurid;
import com.koneksi.koneksi;
import com.view.loginFrame;
import com.view.loginMurid;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.sql.Date;
import javax.swing.JLabel;

/**
 *
 * @author musti
 */
public class login_murid implements controller_loginmurid {
    public setText lblNIS;
    public setText lblNAMA;
    public setText lblTGL;
 

    @Override
    public void hadir(loginMurid lm) throws SQLException {
          try {
           Connection con = Koneksi.getcon();
           String sql = "Insert Into input VALUES(?,?,?)";
           PreparedStatement prepare = con.prepareStatement(sql);
           prepare.setString(1, lm.lblNIS.getText());
           prepare.setString(2, lm.lblNAMA.getText());
           prepare.setString(3, lm.lblTGL.getText());
           prepare.executeUpdate();
           JOptionPane.showMessageDialog(null, "Mohon tunggu persetujuan guru anda");
           prepare.close();
       } catch (Exception e) {
           System.out.println(e);
       }  
    }

    @Override
    public void tampil(loginMurid lm) throws SQLException {
        
          try {
        Connection con = Koneksi.getcon();
        Statement s = con.createStatement();
        String sql = "SELECT * FROM data ORDER BY Kode_mi ASC";         
        ResultSet rs = s.executeQuery(sql);
               
       while(rs.next()){
            String nis = rs.getString(1); 
            String nama = rs.getString(2); 
            Date tgl = rs.getDate(3); 

            // Tambahkan data ke dalam JLabel
            lblNIS.setText("NIS: " + nis + ", NAMA: " + nama + ", TANGGAL: " + tgl);
            lblNAMA.setText("NIS: " + nis + ", NAMA: " + nama + ", TANGGAL: " + tgl);
            lblTGL.setText("NIS: " + nis + ", NAMA: " + nama + ", TANGGAL: " + tgl);
       }

        // Tambahkan JLabel ke dalam panel
        add(lblNIS);
        add(lblNAMA);
        add(lblTGL);
    } catch (SQLException e) {
        System.out.println(e);
    }
}  

   

        
        
        
        
    }
//          
//    // Tambahkan JLabel ke dalam model tampil
//    lm.add(label);
//
//    // Tampilkan model tampil
//    lm.setVisible(true);
//
//         try {
//           Connection con = Koneksi.getcon();
//           Statement s = con.createStatement();
//           String sql = "SELECT * FROM data ORDER BY Kode_mi ASC";         
//           ResultSet rs = s.executeQuery(sql);
//           String lblNIS = rs.getString(1);
//           String lblNAMA = rs.getString(2);
//           String lblTGL = rs.getString(3);
//       }catch (Exception e) {
//           System.out.println(e);
//      }    
//    }
    }
    
    
    

  
   
    

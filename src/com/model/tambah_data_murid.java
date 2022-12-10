/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import com.controller.controller_datamurid;
import com.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;


/**
 *
 * @author musti
 */
public class tambah_data_murid implements controller_datamurid{

    @Override
    public void Submit(com.view.tambah_data_murid tbm) throws SQLException {                                 
       try {
            Connection con = koneksi.getcon();
            String sql = "Insert Into absensi_rpl Values(?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, tbm.txtNis.getText());
            prepare.setString(2, tbm.txtnama.getText());
            prepare.setString(3, tbm.txtpsswrd.getText());
              prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Murid Berhasil Ditambah");
        } catch (Exception e) {
            System.out.println(e);
        }

    
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.controller.KehadiranSiswa;
import com.view.KehadiranFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lab 1
 */
public class model_kehadiran implements KehadiranSiswa{

    @Override
    public void Submit(KehadiranFrame kf) throws SQLException {
        try {
            Connection con = koneksi.getcon();
            String sql = "Insert Into absensi_rpl Values(?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, kf.TabelKehadiran.getName());
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            prepare.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
            System.out.println(e);
        }
    }

    @Override
    public void Tampil(KehadiranFrame kf) throws SQLException {
        try {
        Connection con = koneksi.getcon();
        Statement stt = con.createStatement();
        String sql = "SELECT * FROM siswa ORDER BY NIS ASC";
        ResultSet res = stt.executeQuery(sql);
        while (res.next()){
            Object[] ob = new Object[8];
            ob[0] = res.getString(1);
            ob[1] = res.getString(2);
            ob[2] = res.getString(3);
            ob[3] = res.getString(4);
      
        }
    }catch (Exception e){
            System.out.println(e);
}
    
}
}

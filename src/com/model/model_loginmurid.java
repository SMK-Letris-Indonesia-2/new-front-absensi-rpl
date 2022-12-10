/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;
import com.controller.controller_loginmurid;
import com.koneksi.koneksi;
import com.view.loginFrame;
import com.view.loginMurid;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author MSI
 */
public class model_loginmurid implements controller_loginmurid{

    @Override
    public void simpan(loginMurid lf) throws SQLException {
        Connection con = koneksi.getcon();
        String sql = "SELECT * FROM data_murid WHERE nis=? and nama=?";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
try{
pst=con.prepareStatement(sql);
pst.setString(1, lf.TxtNis.getText());
pst.setString(2, lf.TxtNama.getText());
rs=pst.executeQuery();
if(rs.next()){
JOptionPane.showMessageDialog(null, "Berhasil login");
}else{
JOptionPane.showMessageDialog(null, "Salah NIK atau Nama siswa");
}
}catch (SQLException e){
    System.out.println("Error"+e);
}
    }
    
}

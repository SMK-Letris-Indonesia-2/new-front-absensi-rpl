/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package com.model ;

    import com.controller.controller_tambah_data_murid ;
    import java.sql.Connection ;
    import java.sql.PreparedStatement ;
    import java.sql.SQLException ;
    import javax.swing.JOptionPane ;

    /**
     *
     * @author musti
     */
    public class tambah_data_murid implements controller_tambah_data_murid {

        @Override
        public void Submit(com.view.tambah_data_murid tdm) throws SQLException {
            try {
                Connection con = koneksi.getcon();
                String sql = "Insert Into absensi_rpl Values(?,?,?)";
                PreparedStatement prepare = con.prepareStatement(sql);
                prepare.setString(1, tdm.txtNis.getText());
                prepare.setString(2, tdm.txtnama.getText());
                prepare.setString(3, tdm.txtpsswrd.getText());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Murid Berhasil Ditambah");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Murid gagal di simpan");
                System.out.println(e);
            }
        }

    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.view.tambah_data_murid;
import java.sql.SQLException;

/**
 *
 * @author PC LAB 2
 */
public interface controller_tambah_data_murid {
    public void simpan (tambah_data_murid tdm) throws SQLException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import com.view.LoginAsAdmin;
import java.sql.SQLException;

public interface controller_admin {
    public void tambah_Guru(LoginAsAdmin laa)throws SQLException;
    public void tambah_Murid(LoginAsAdmin laa)throws SQLException;
}

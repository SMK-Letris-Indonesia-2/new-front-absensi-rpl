package com.controller;

import com.view.loginMurid;
import java.sql.SQLException;
import com.model.login_murid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB 2 PC 36
 */
public interface controller_loginmurid {
    public void hadir (loginMurid lm) throws SQLException;   
    public void tampil (loginMurid lm) throws SQLException;   

}

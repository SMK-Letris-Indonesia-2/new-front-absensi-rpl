/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.sql.SQLException;
import com.view.loginasguru;
/**
 *
 * @author Lab 1
 */
public interface controller_loginasgr {
    public void Setujui(loginasguru loginasgr) throws SQLException;
    public void Tambah (loginasguru loginasgr) throws SQLException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.view.KehadiranFrame;
import java.sql.SQLException;

/**
 *
 * @author LAB 2 PC 21
 */
public interface KehadiranSiswa {
    public void Submit (KehadiranFrame kf) throws SQLException;
    public void Tampil (KehadiranFrame kf) throws SQLException;
}

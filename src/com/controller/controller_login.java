/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.view.loginFrame;
import java.sql.SQLException;

/**
 *
 * @author LAB 1 RPL
 */
public interface controller_login {
    public void login (loginFrame lf) throws SQLException;
}

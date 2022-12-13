package com.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class koneksi {
    private static Connection con;
    public static Connection getcon() {
    if (con == null) {
        try {
            String url = "jdbc:mysql://localhost/absensi_rpl"; //nama database
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        return con;
    }
}
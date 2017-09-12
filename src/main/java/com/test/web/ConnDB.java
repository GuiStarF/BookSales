package com.test.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
    public static final String url = "jdbc:mysql://localhost:3306/sql";
    public static final String user = "root";
    public static final String passwd = "root";

    private Connection ct = null;

    public Connection getCt() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ct = DriverManager.getConnection(url,user,passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ct;
    }
}

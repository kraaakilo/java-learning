package com.kraaakilo.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection implements DatabaseConnectionInterface {
    public Connection connect() throws Exception {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop", "kratos", "kratos@123");
        } catch (Exception exception) {
            return null;
        }
    }
}

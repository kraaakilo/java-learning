package com.kraaakilo.database;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Product {

    final DatabaseConnectionInterface connection;

    public Product(DatabaseConnectionInterface connection) {
        this.connection = connection;
    }

    public void all() throws Exception {
        try {
            Statement statement = this.connection.connect().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
        } catch (Exception e) {
            System.out.println("Connection impossible : " + e.getMessage());
        }
    }
}

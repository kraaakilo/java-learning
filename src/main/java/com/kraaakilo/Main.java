package com.kraaakilo;

import com.kraaakilo.database.MySQLConnection;
import com.kraaakilo.database.Product;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MySQLConnection connection = new MySQLConnection();
        Product product = new Product(connection);
        product.all();
    }
}
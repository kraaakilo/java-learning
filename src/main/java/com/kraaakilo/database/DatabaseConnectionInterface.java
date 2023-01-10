package com.kraaakilo.database;

import java.sql.Connection;

public interface DatabaseConnectionInterface {
    public Connection connect() throws Exception;
}

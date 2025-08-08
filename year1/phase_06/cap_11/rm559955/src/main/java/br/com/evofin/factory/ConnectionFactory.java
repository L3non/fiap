package br.com.evofin.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:oracle:thin:@//187.8.12.142:1521/orcl";
    private static final String USER = "rm559955";
    private static final String PASSWORD = "180106";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

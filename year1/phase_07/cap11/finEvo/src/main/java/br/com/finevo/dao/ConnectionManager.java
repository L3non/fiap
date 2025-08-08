package br.com.finevo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private static final String USER = "RM559955";
    private static final String PASS = "180106";

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão", e);
        }
    }
}

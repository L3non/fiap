package br.com.finevo.dao.impl;

import br.com.finevo.dao.ConnectionManager;
import br.com.finevo.dao.UserDao;
import br.com.finevo.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleUserDao implements UserDao {

    private Connection connection;

    @Override
    public boolean validateUser(User user) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM TB_USUARIO " +
                    "WHERE DS_EMAIL = ? AND DS_SENHA = ?";

            stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getPassword());
            rs = stmt.executeQuery();

            if (rs.next()){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }finally {
            try {
                stmt.close();
                rs.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
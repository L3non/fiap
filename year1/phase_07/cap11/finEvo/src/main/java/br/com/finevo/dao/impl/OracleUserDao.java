package br.com.finevo.dao.impl;

import br.com.finevo.dao.ConnectionManager;
import br.com.finevo.dao.UserDao;
import br.com.finevo.model.User;

import java.sql.*;

public class OracleUserDao implements UserDao {

    @Override
    public boolean register(User user) {
        String sql = "INSERT INTO TB_USUARIO (ID_USUARIO, DS_EMAIL, DS_SENHA) VALUES (SEQ_USER.NEXTVAL, ?, ?)";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getPassword());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean validate(User user) {
        String sql = "SELECT * FROM TB_USUARIO WHERE DS_EMAIL = ? AND DS_SENHA = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getPassword());
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

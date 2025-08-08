package br.com.evofin.dao;

import br.com.evofin.factory.ConnectionFactory;
import br.com.evofin.model.*;

import java.sql.*;
import java.util.*;

class TipoDAO {
    public void insert(Tipo tipo) {
        String sql = "INSERT INTO T_TIPO (id_tipo, nm_tipo, ds_tipo) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, tipo.getIdTipo());
            stmt.setString(2, tipo.getNome());
            stmt.setString(3, tipo.getDescricao());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Tipo> getAll() {
        List<Tipo> list = new ArrayList<>();
        String sql = "SELECT * FROM T_TIPO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Tipo t = new Tipo();
                t.setIdTipo(rs.getInt("id_tipo"));
                t.setNome(rs.getString("nm_tipo"));
                t.setDescricao(rs.getString("ds_tipo"));
                list.add(t);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
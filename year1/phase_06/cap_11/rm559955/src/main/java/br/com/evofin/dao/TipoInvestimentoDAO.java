package br.com.evofin.dao;

import br.com.evofin.factory.ConnectionFactory;
import br.com.evofin.model.*;

import java.sql.*;
import java.util.*;

class TipoInvestimentoDAO {
    public void insert(TipoInvestimento tipo) {
        String sql = "INSERT INTO T_TIPO_INVESTIMENTO (id_tipo_investimento, nm_tipo_investimento) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, tipo.getIdTipoInvestimento());
            stmt.setString(2, tipo.getTipoInvestimento());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<TipoInvestimento> getAll() {
        List<TipoInvestimento> list = new ArrayList<>();
        String sql = "SELECT * FROM T_TIPO_INVESTIMENTO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                TipoInvestimento t = new TipoInvestimento();
                t.setIdTipoInvestimento(rs.getInt("id_tipo_investimento"));
                t.setTipoInvestimento(rs.getString("nm_tipo_investimento"));
                list.add(t);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
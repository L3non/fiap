package br.com.evofin.dao;

import br.com.evofin.factory.ConnectionFactory;
import br.com.evofin.model.*;

import java.sql.*;
import java.util.*;

class InvestimentoRendimentoDAO {
    public void insert(InvestimentoRendimento rend) {
        String sql = "INSERT INTO T_RENDIMENTO (id_rendimento, pc_rendimento, vl_rendimento) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, rend.getIdRendimento());
            stmt.setDouble(2, rend.getRendimentoPorcentagem());
            stmt.setDouble(3, rend.getRendimentoValor());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<InvestimentoRendimento> getAll() {
        List<InvestimentoRendimento> list = new ArrayList<>();
        String sql = "SELECT * FROM T_RENDIMENTO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                InvestimentoRendimento r = new InvestimentoRendimento();
                r.setIdRendimento(rs.getInt("id_rendimento"));
                r.setRendimentoPorcentagem(rs.getDouble("pc_rendimento"));
                r.setRendimentoValor(rs.getDouble("vl_rendimento"));
                list.add(r);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
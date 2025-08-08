package br.com.evofin.dao;

import br.com.evofin.factory.ConnectionFactory;
import br.com.evofin.model.*;

import java.sql.*;
import java.util.*;

public class InvestimentoDAO {
    public void insert(Investimento inv) {
        String sql = "INSERT INTO T_INVESTIMENTO (id_investimento, id_user, id_tipo_investimento, id_instituicao, vl_investimento, dt_aplicacao, id_rendimento) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, inv.getIdInvestimento());
            stmt.setInt(2, inv.getIdUser());
            stmt.setInt(3, inv.getIdTipoInvestimento());
            stmt.setInt(4, inv.getIdInstituicao());
            stmt.setDouble(5, inv.getInvestimentoValor());
            stmt.setDate(6, new java.sql.Date(inv.getInvestimentoDataAplicacao().getTime()));
            stmt.setInt(7, inv.getIdRendimento());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Investimento> getAll() {
        List<Investimento> list = new ArrayList<>();
        String sql = "SELECT * FROM T_INVESTIMENTO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Investimento i = new Investimento();
                i.setIdInvestimento(rs.getInt("id_investimento"));
                i.setIdUser(rs.getInt("id_user"));
                i.setIdTipoInvestimento(rs.getInt("id_tipo_investimento"));
                i.setIdInstituicao(rs.getInt("id_instituicao"));
                i.setInvestimentoValor(rs.getDouble("vl_investimento"));
                i.setInvestimentoDataAplicacao(rs.getDate("dt_aplicacao"));
                i.setIdRendimento(rs.getInt("id_rendimento"));
                list.add(i);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}

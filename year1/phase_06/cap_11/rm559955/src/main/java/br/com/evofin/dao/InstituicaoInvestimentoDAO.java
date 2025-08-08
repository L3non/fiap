package br.com.evofin.dao;

import br.com.evofin.factory.ConnectionFactory;
import br.com.evofin.model.*;

import java.sql.*;
import java.util.*;

class InstituicaoInvestimentoDAO {
    public void insert(InstituicaoInvestimento inst) {
        String sql = "INSERT INTO T_INSTITUICAO (id_instituicao, nm_instituicao) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, inst.getIdInstituicao());
            stmt.setString(2, inst.getNomeInstituicao());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<InstituicaoInvestimento> getAll() {
        List<InstituicaoInvestimento> list = new ArrayList<>();
        String sql = "SELECT * FROM T_INSTITUICAO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                InstituicaoInvestimento i = new InstituicaoInvestimento();
                i.setIdInstituicao(rs.getInt("id_instituicao"));
                i.setNomeInstituicao(rs.getString("nm_instituicao"));
                list.add(i);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
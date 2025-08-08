package br.com.evofin.dao;

import br.com.evofin.factory.ConnectionFactory;
import br.com.evofin.model.*;

import java.sql.*;
import java.util.*;

class PerfilDAO {
    public void insert(Perfil perfil) {
        String sql = "INSERT INTO T_PERFIL (id_perfil, objetivo_previo, investimentos_interesse, objetivo, vl_objetivo, ds_objetivo, perfil_escolhido) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, perfil.getIdPerfil());
            stmt.setString(2, perfil.getObjetivoPrevio());
            stmt.setString(3, perfil.getInvestimentosDeInteresse());
            stmt.setString(4, perfil.getObjetivo());
            stmt.setDouble(5, perfil.getValor());
            stmt.setString(6, perfil.getObjetivoDesc());
            stmt.setString(7, perfil.getPerfilEscolhido());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Perfil> getAll() {
        List<Perfil> list = new ArrayList<>();
        String sql = "SELECT * FROM T_PERFIL";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Perfil p = new Perfil();
                p.setIdPerfil(rs.getInt("id_perfil"));
                p.setObjetivoPrevio(rs.getString("objetivo_previo"));
                p.setInvestimentosDeInteresse(rs.getString("investimentos_interesse"));
                p.setObjetivo(rs.getString("objetivo"));
                p.setValor(rs.getDouble("vl_objetivo"));
                p.setObjetivoDesc(rs.getString("ds_objetivo"));
                p.setPerfilEscolhido(rs.getString("perfil_escolhido"));
                list.add(p);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
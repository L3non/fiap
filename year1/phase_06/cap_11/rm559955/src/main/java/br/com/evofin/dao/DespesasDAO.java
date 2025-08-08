package br.com.evofin.dao;

import br.com.evofin.model.Despesas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DespesasDAO {
    private Connection connection;

    public DespesasDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(Despesas despesa) throws SQLException {
        String sql = "INSERT INTO T_DESPESAS (id_despesa, id_tipo, despesa_nome, despesa_descricao, despesa_valor, despesa_data, id_user) "
                + "VALUES (seq_despesa.NEXTVAL, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, despesa.getIdTipo());
            stmt.setString(2, despesa.getDespesaNome());
            stmt.setString(3, despesa.getDespesaDescricao());
            stmt.setDouble(4, despesa.getDespesaValor());
            stmt.setDate(5, despesa.getDespesaData());
            stmt.setInt(6, despesa.getIdUser());
            stmt.executeUpdate();
        }
    }

    public List<Despesas> listar() throws SQLException {
        List<Despesas> despesas = new ArrayList<>();
        String sql = "SELECT * FROM T_DESPESAS";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Despesas d = new Despesas();
                d.setIdDespesa(rs.getInt("id_despesa"));
                d.setIdTipo(rs.getInt("id_tipo"));
                d.setDespesaNome(rs.getString("despesa_nome"));
                d.setDespesaDescricao(rs.getString("despesa_descricao"));
                d.setDespesaValor(rs.getDouble("despesa_valor"));
                d.setDespesaData(rs.getDate("despesa_data"));
                d.setIdUser(rs.getInt("id_user"));
                despesas.add(d);
            }
        }
        return despesas;
    }
}

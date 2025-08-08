package br.com.finevo.dao.impl;

import br.com.finevo.dao.CategoryDao;
import br.com.finevo.dao.ConnectionManager;
import br.com.finevo.model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleCategoryDao implements CategoryDao {

    private Connection connection;

    @Override
    public List<Category> list() {
        List<Category> list = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM TB_CATEGORIA");
            rs = stmt.executeQuery();

            // Percorre todos os registros encontrados
            while (rs.next()) {
                int code = rs.getInt("COD_CATEGORIA");
                String name = rs.getString("NOME_CATEGORIA");
                Category category = new Category(code, name);
                list.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                stmt.close();
                rs.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
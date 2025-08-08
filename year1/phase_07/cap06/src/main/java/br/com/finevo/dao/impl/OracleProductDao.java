package br.com.finevo.dao.impl;

import br.com.finevo.dao.ConnectionManager;
import br.com.finevo.dao.ProductDao;
import br.com.finevo.exception.DBException;
import br.com.finevo.model.Category;
import br.com.finevo.model.Product;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OracleProductDao implements ProductDao {

    private Connection connection;

    @Override
    public void register(Product product) throws DBException {
        PreparedStatement stmt = null;

        connection = ConnectionManager.getInstance().getConnection();

        String sql = "INSERT INTO TB_PRODUTO " +
                "(COD_PRODUTO, NOME_PRODUTO, QTDE_PRODUTO, " +
                    "VALOR_PRODUTO, DATA_FABRICACAO, COD_CATEGORIA)" +
                    "VALUES (SQ_TB_PRODUTO.NEXTVAL, ?, ?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getAmount());
            stmt.setDouble(3, product.getValue());
            stmt.setDate(4, Date.valueOf(product.getFabricationDate()));
            stmt.setInt(5, product.getCategory().getCode());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new DBException("Error registering.");

        } finally {
            try {
                stmt.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Product product) throws DBException {

        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE TB_PRODUTO SET " +
                    "NOME_PRODUTO = ?, " +
                    "QTDE_PRODUTO = ?, " +
                    "VALOR_PRODUTO = ?, " +
                    "DATA_FABRICACAO = ?, " +
                    "COD_CATEGORIA = ? " +
                    "WHERE COD_PRODUTO = ?";

            stmt = connection.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getAmount());
            stmt.setDouble(3, product.getValue());
            stmt.setDate(4, Date.valueOf(product.getFabricationDate()));
            stmt.setInt(5, product.getCategory().getCode());
            stmt.setInt(6, product.getCode());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DBException("Error updating.");

        } finally {
            try {
                stmt.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void remove(int code) throws DBException {

        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = "DELETE FROM TB_PRODUTO WHERE COD_PRODUTO = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, code);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DBException("Error removing.");

        } finally {
            try {
                stmt.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Product search(int code) {

        Product product = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = "SELECT * FROM TB_PRODUTO " +
                    "INNER JOIN TB_CATEGORIA " +
                    "ON TB_PRODUTO.COD_CATEGORIA = TB_CATEGORIA.COD_CATEGORIA " +
                    "WHERE TB_PRODUTO.COD_PRODUTO = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, code);
            rs = stmt.executeQuery();

            if (rs.next()){
                int returnedCode = rs.getInt("COD_PRODUTO");
                String name = rs.getString("NOME_PRODUTO");
                int amount = rs.getInt("QTDE_PRODUTO");
                double value = rs.getDouble("VALOR_PRODUTO");
                LocalDate date = rs.getDate("DATA_FABRICACAO").toLocalDate();
                int codeCategory = rs.getInt("COD_CATEGORIA");
                String nameCategory = rs.getString("NOME_CATEGORIA");

                product = new Product(returnedCode, name, value, date, amount);

                Category category = new Category(codeCategory, nameCategory);

                product.setCategory(category);
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
        return product;
    }

    @Override
    public List<Product> list() {

        List<Product> list = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = "SELECT * FROM TB_PRODUTO " +
                    "INNER JOIN TB_CATEGORIA " +
                    "ON TB_PRODUTO.COD_CATEGORIA = TB_CATEGORIA.COD_CATEGORIA";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            // Go through all the records found
            while (rs.next()) {
                int code = rs.getInt("COD_PRODUTO");
                String name = rs.getString("NOME_PRODUTO");
                int amount = rs.getInt("QTDE_PRODUTO");
                double value = rs.getDouble("VALOR_PRODUTO");
                java.sql.Date date = rs.getDate("DATA_FABRICACAO");
                LocalDate fabricationDate = rs.getDate("DATA_FABRICACAO").toLocalDate();
                int codeCategory = rs.getInt("COD_CATEGORIA");
                String nameCategory = rs.getString("NOME_CATEGORIA");


                Product product = new Product(code, name, value, fabricationDate, amount);
                Category category = new Category(codeCategory, nameCategory);
                product.setCategory(category);
                list.add(product);

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
        return list;
    }
}
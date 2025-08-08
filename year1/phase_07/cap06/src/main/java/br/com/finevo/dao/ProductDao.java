package br.com.finevo.dao;

import br.com.finevo.exception.DBException;
import br.com.finevo.model.Product;

import java.util.List;

public interface ProductDao {

    void register(Product product) throws DBException;
    void update(Product product) throws DBException;
    void remove(int code) throws DBException;
    Product search(int id);
    List<Product> list();

}
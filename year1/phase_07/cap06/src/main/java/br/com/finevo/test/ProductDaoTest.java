package br.com.finevo.test;

import br.com.finevo.dao.ProductDao;
import br.com.finevo.exception.DBException;
import br.com.finevo.factory.DaoFactory;
import br.com.finevo.model.Product;

import java.time.LocalDate;
import java.util.List;

public class ProductDaoTest {
    public static void main(String[] args) {

        ProductDao dao = DaoFactory.getProductDao();

        // Register a product
        Product product = new Product(
                0,
                "Mouse wireless",
                77.49, LocalDate.of(2024, 10, 21),
                63);
//        try {
//            dao.register(product);
//            System.out.println("Registered product.");
//        } catch (DBException e) {
//            e.printStackTrace();
//        }

        // Search for a product by code and update
//        product = dao.search(4);
//        product.setName("Monitor LED 24P");
//        product.setValue(891.99);
//        try {
//            dao.update(product);
//            System.out.println("Updated product.");
//        } catch (DBException e) {
//            e.printStackTrace();
//        }

        // List products
//        List<Product> list = dao.list();
//        for (Product item : list) {
//            System.out.println(
//                    item.getName() + " " +
//                            item.getAmount() + " " +
//                            item.getValue());
//        }

        // Remove a product
        try {
            dao.remove(4);
            System.out.println("Product removed.");
        } catch (DBException e) {
            e.printStackTrace();
        }

    }
}
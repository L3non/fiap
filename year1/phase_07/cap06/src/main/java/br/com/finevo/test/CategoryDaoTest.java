package br.com.finevo.test;

import br.com.finevo.dao.CategoryDao;
import br.com.finevo.factory.DaoFactory;
import br.com.finevo.model.Category;

import java.util.List;

public class CategoryDaoTest {

    public static void main(String[] args) {
        CategoryDao dao = DaoFactory.getCategoryDao();

        List<Category> list = dao.list();
        for (Category category : list) {
            System.out.println(category.getCode() + " " + category.getName());
        }
    }
}
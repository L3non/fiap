package br.com.finevo.controller;

import br.com.finevo.dao.CategoryDao;
import br.com.finevo.dao.ProductDao;
import br.com.finevo.exception.DBException;
import br.com.finevo.factory.DaoFactory;
import br.com.finevo.model.Category;
import br.com.finevo.model.Product;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    private ProductDao dao;
    private CategoryDao categoryDao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        switch (action){
            case "register":
                register(req, resp);
                break;
            case "edit":
                edit(req, resp);
                break;
            case "remove":
                remove(req, resp);
                break;
        }


    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String name = req.getParameter("name");
            int amount = Integer.parseInt(req.getParameter("amount"));
            double price = Double.parseDouble(req.getParameter("price"));
            LocalDate fabrication = LocalDate.parse(req.getParameter("fabrication"));
            int codeCategory = Integer.parseInt(req.getParameter("category"));

            Category category = new Category();
            category.setCode(codeCategory);

            Product product = new Product(
                    0,
                    name,
                    price,
                    fabrication,
                    amount
            );

            product.setCategory(category);

            dao.register(product);

            req.setAttribute("message", "Product registered!");

        } catch (DBException db) {
            db.printStackTrace();
            req.setAttribute("error", "Error registering");

        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("error","Please validate the data");

        }

        // req.getRequestDispatcher("register-product.jsp").forward(req, resp);
        openFormRegister(req, resp);
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int code = Integer.parseInt(req.getParameter("code"));
            String name = req.getParameter("name");
            int amount = Integer.parseInt(req.getParameter("amount"));
            double price = Double.parseDouble(req.getParameter("price"));
            LocalDate fabrication = LocalDate.parse(req.getParameter("fabrication"));
            int codeCategory = Integer.parseInt(req.getParameter("category"));

            Category category = new Category();
            category.setCode(codeCategory);

            Product product = new Product(code, name, price, fabrication, amount);
            product.setCategory(category);
            dao.update(product);

            req.setAttribute("message", "Updated product!");

        } catch (DBException db) {
            db.printStackTrace();
            req.setAttribute("error", "Error updating");

        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("error", "Please validate the data");
        }

        list(req,resp);
    }

    private void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int code = Integer.parseInt(req.getParameter("codeRemove"));

        try {
            dao.remove(code);
            req.setAttribute("message", "Product removed!");

        } catch (DBException e) {
            e.printStackTrace();
            req.setAttribute("error", "Error updating");
        }

        list(req,resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);
        dao = DaoFactory.getProductDao();
        categoryDao = DaoFactory.getCategoryDao();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        switch (action){
            case "list":
                list(req, resp);
                break;

            case "open-form-edit":
                openForm(req, resp);
                break;
            case "open-form-register":
                openFormRegister(req, resp);
                break;
        }

    }

    private void openFormRegister(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        loadOptionsCategories(req);
        req.getRequestDispatcher("register-product.jsp").forward(req, resp);
    }

    private void loadOptionsCategories(HttpServletRequest req) {
        List<Category> list = categoryDao.list();
        req.setAttribute("categories", list);
    }

    private void openForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("code"));
        Product product = dao.search(id);
        req.setAttribute("product", product);
        loadOptionsCategories(req);

        req.getRequestDispatcher("edit-product.jsp").forward(req, resp);
    }

    private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = dao.list();
        req.setAttribute("products", list);
        req.getRequestDispatcher("product-list.jsp").forward(req, resp);
    }
}
package br.com.finevo.controller;

import br.com.finevo.dao.UserDao;
import br.com.finevo.dao.impl.OracleUserDao;
import br.com.finevo.model.User;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private final UserDao dao = new OracleUserDao();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("password");

        User user = new User(email, senha);

        if (dao.register(user)) {
            req.setAttribute("success", "Cadastro realizado com sucesso!");
        } else {
            req.setAttribute("error", "Erro ao cadastrar.");
        }

        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }
}

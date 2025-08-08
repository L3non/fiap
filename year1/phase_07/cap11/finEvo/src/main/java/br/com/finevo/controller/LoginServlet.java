package br.com.finevo.controller;

import br.com.finevo.dao.UserDao;
import br.com.finevo.dao.impl.OracleUserDao;
import br.com.finevo.model.User;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final UserDao dao = new OracleUserDao();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("password");

        User user = new User(email, senha);

        if (dao.validate(user)) {
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("success.jsp");
        } else {
            req.setAttribute("error", "Login inválido");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}

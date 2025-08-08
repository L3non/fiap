package br.com.finevo.controller;

import br.com.finevo.bo.EmailBo;
import br.com.finevo.dao.UserDao;
import br.com.finevo.exception.EmailException;
import br.com.finevo.factory.DaoFactory;
import br.com.finevo.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private UserDao dao;
    private EmailBo bo;

    public LoginServlet() {
        dao = DaoFactory.getUserDao();
        bo = new EmailBo();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(email, password);

        if (dao.validateUser(user)) {

            HttpSession session = request.getSession();
            session.setAttribute("user", email);

            String message =
                    "A login was performed on the platform at " + LocalDate.now();
            request.getRequestDispatcher("home.jsp").forward(request, response);

            try {
                bo.sendEmail(email, "Login Completed", message);
            } catch (EmailException e) {
                e.printStackTrace();
            }

        }else {
            request.setAttribute("error", "Invalid username and/or password");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }
}

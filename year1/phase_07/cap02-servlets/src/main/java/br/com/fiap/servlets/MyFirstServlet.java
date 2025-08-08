package br.com.fiap.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyFirstServlet")

public class MyFirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MyFirstServlet() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        response.getWriter().append("Served at: ").append(request.getContextPath());
        response.getWriter().append("<b>My First Servlet</b>");
    }
}

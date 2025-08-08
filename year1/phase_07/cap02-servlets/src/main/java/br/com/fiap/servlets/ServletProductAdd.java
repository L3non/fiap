package br.com.fiap.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletProductAdd")

public class ServletProductAdd extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletProductAdd() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String value = request.getParameter("value");

        HttpSession session = request.getSession();
        session.setAttribute("product", name + ";" + value);

        response.sendRedirect("sucess.html");
    }
}

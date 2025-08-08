package br.com.fiap.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletProductShow")

public class ServletProductShow extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletProductShow() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();
        String sProduct = (String) session.getAttribute("product");

        if (sProduct != null) {
            String product[] = sProduct.split(";");
            PrintWriter out = response.getWriter();
            out.append(sProduct + "<br>");

            for (String p: product) {
                out.println(p);
            }

            out.append("Product name: " + product[0] + "<br>");
            out.append("Product price: " + product[1] + "<br>");
        }
    }
}

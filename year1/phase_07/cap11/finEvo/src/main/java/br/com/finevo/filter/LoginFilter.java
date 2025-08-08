package br.com.finevo.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String uri = req.getRequestURI();
        HttpSession session = req.getSession(false);

        boolean loggedIn = session != null && session.getAttribute("user") != null;
        boolean loginRequest = uri.contains("login") || uri.contains("register") || uri.contains("home.jsp");

        if (loggedIn || loginRequest || uri.contains("resources")) {
            chain.doFilter(request, response);
        } else {
            req.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

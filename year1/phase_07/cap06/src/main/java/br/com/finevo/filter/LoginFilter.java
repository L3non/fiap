package br.com.finevo.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        String url = req.getRequestURI();

        if (session.getAttribute("user") == null && !url.endsWith("login") && !url.contains("resources") && !url.contains("home")) {
            request.setAttribute("error", "Enter your username and password!");
            request.getRequestDispatcher("home.jsp").forward(request, resp);

        } else {
            chain.doFilter(request, resp);
        }

    }
}

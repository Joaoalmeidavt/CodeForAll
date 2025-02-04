package io.codeforall.fanstatics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/form.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        Integer phone = Integer.valueOf(req.getParameter("phone"));

        getServletContext().setAttribute("username", username);
        getServletContext().setAttribute("email", email);
        getServletContext().setAttribute("phone", phone);

        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/welcome.jsp");
        dispatcher.forward(req, resp);
    }
}

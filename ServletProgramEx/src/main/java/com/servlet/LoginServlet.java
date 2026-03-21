package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        HashMap<String, String> map = SignUp.getMap();

        if (map.containsKey(email) && map.get(email).equals(password)) {
            RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
            rd.forward(req, res);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
            rd.forward(req, res);
        }
    }
}
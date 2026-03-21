package com.servlet;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUp extends HttpServlet{
    private static HashMap<String,String> map=new HashMap<>();

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("welocome");
        String name=req.getParameter("name");
        String mail=req.getParameter("email");
        String pwd=req.getParameter("password");

        //store mail key value is pwd
        map.put(mail, pwd);

        RequestDispatcher dispatch = req.getRequestDispatcher("Login.jsp");
        dispatch.forward(req, res);
    }

    public static HashMap<String, String> getMap() {
        return map;
    }
}

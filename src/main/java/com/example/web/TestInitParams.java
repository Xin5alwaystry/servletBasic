package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TestInitParams extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Test init parameters.<br>");

        Enumeration<String> initParameterNames = getServletConfig().getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            writer.println("<br>param name = " + initParameterNames.nextElement() + "<br>");
        }
        writer.println("main email is: " + getServletConfig().getInitParameter("mainEmail"));
        writer.println("<br>");
        writer.println("admin email is: " + getServletConfig().getInitParameter("adminEmail"));
    }
}

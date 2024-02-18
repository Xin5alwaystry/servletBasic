package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xin5
 * @since 2024年02月18日 22:13:15
 */
public class ListenerTester extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("test context attribute set by listener.");
        writer.println("<br>");
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        writer.println("Dog's breed is: " + dog.getBreed());
    }
}

package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * test
 * @author xin5
 * @since 2023年12月02日 18:40:09
 */
public class BeerSelect extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String c = req.getParameter("color");
        List<String> brands = new BeerExpert().getBrands(c);
        //resp.setContentType("text/html");
        //PrintWriter out = resp.getWriter();
        //out.println("Beer Selection Advice <br/>");
        //for (String brand : brands) {
        //    out.println("<br>try: " + brand);
        //}
        req.setAttribute("styles", brands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}

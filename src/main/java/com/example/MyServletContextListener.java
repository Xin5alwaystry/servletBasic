package com.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author xin5
 * @since 2024年02月18日 22:12:20
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String breed = (String) servletContext.getAttribute("breed");
        servletContext.setAttribute("dog", new Dog(breed));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

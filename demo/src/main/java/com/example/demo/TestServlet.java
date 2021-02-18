package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "search", urlPatterns = { "/search" })
public class TestServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
             doGet(request,response);
        }
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
                 response.setContentType("text/html");
                 PrintWriter out = response.getWriter();
             out.println("<h3>Hello Servlet!</h3>");  
        }
}

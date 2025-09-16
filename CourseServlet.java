package com.example.course.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Available Online Courses</h2>");
        out.println("<ul>");
        out.println("<li>Java Programming - ₹2000</li>");
        out.println("<li>Web Development - ₹3000</li>");
        out.println("<li>Data Science - ₹4000</li>");
        out.println("</ul>");
        out.println("<a href='index.jsp'>Go Back</a>");
        out.println("</body></html>");
    }
}

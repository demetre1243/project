package com.library;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/borrow")
public class BorrowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>Borrowing Page</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookCode = request.getParameter("bookCode");
        String memberId = request.getParameter("memberId");

        response.getWriter().println("<h1>Book borrowed</h1>");
    }

    protected void doPostReturn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookCode = request.getParameter("bookCode");

        response.getWriter().println("<h1>Book returned</h1>");
    }
}

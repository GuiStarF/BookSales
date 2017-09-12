package com.test.web.controller;

import com.test.web.model.Book;
import com.test.web.service.BookDeal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddBook")

public class AddBook extends HttpServlet{
    protected void doGet (HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("bookId");
        String name = request.getParameter("bookName");
        String num = request.getParameter("bookNum");
        String a = request.getParameter("bookA");
        String b = request.getParameter("bookB");

        BookDeal bd = new BookDeal();
        boolean state = bd.addeBook(id,name,num,a,b);
        if(state) {
            response.sendRedirect("DealSuccess.jsp");

        } else {
            response.sendRedirect("DealFailed.jsp");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}

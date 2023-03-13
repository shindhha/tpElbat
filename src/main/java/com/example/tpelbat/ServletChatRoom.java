package com.example.tpelbat;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletChatRoom", value = "/ServletChatRoom")
public class ServletChatRoom extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        chatRoom.getInstance().postMessage(request.getParameter("pseudo"),request.getParameter("msg"));
        getServletContext().getRequestDispatcher("/chatRoom.jsp").forward(request,response);

    }
}
